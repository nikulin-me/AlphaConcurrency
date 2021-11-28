package alpha.currency.service.currency;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService{
    private  final CurrencyFeignClient currencyFeignClient;


    @Override
    public Double getLatest(String appId,String currency) {
        System.out.println(getCurrencies(appId));
        return getCurrencies(appId).get(currency);
    }

    @Override
    public Double getHistorical(String app_id, String currency) {
        return getCurrenciesYesterday(app_id).get(currency);

    }

    private Map<String, Double> getCurrencies(String appId){
        Map map = new Gson().fromJson(currencyFeignClient.getLatest(appId), Map.class);
        return (Map<String, Double>) map.get("rates");
    }
    private Map<String, Double> getCurrenciesYesterday(String appId){
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis() - 86_400 * 1000*10000);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date(timeStamp.getTime()));
        System.out.println(format);
        Map map = new Gson().fromJson(currencyFeignClient.getHistorical(appId, format), Map.class);
        return (Map<String, Double>) map.get("rates");
    }

    /*private Map<String,Double> getYesterdayPrice(String appId){
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis() - 86_400 * 1000);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date(timeStamp.getTime()));
        Map map = new Gson().fromJson(currencyFeignClient.getHistorical(appId, format), Map.class);
        return (Map<String, Double>) map.get("rates");
    }*/

}
