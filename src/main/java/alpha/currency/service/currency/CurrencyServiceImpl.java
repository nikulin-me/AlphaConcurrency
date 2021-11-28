package alpha.currency.service.currency;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService{
    private  final CurrencyFeignClient currencyFeignClient;


    @Override
    public Map<String, Double> getLatest(String appId) {
        System.out.println(getCurrencies(appId));
        return getCurrencies(appId);
    }

    @Override
    public List<Currency> getHistorical(String app_id,String date) {
        return currencyFeignClient.getHistorical(app_id,date);
    }

    private Map<String, Double> getCurrencies(String appId){
        Map map = new Gson().fromJson(currencyFeignClient.getLatest(appId), Map.class);
        return (Map<String, Double>) map.get("rates");
    }
}
