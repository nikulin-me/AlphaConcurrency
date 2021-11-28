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
    private final long YESTERDAY= 86_400L *1_000_000;


    @Override
    public Double getLatest(String appId,String currency) {
        return getCurrencies(appId).get(currency);
    }

    @Override
    public Double getHistorical(String appId, String currency) {
        return getCurrenciesYesterday(appId).get(currency);

    }

    private Map<String, Double> getCurrencies(String appId){
        Map map = new Gson().fromJson(currencyFeignClient.getLatest(appId), Map.class);
        return (Map<String, Double>) map.get("rates");
    }
    private Map<String, Double> getCurrenciesYesterday(String appId){
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis() - YESTERDAY);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date(timeStamp.getTime()));
        Map map = new Gson().fromJson(currencyFeignClient.getHistorical(appId, format), Map.class);
        return (Map<String, Double>) map.get("rates");
    }
    public Double getDeltaBetweenYesterdayAndNow(String appId,String currency){
        return getLatest(appId,currency)-getHistorical(appId,currency);
    }
}
