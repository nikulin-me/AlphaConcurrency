package alpha.currency.service.currency;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService{
    private  final CurrencyFeignClient currencyFeignClient;


    @Override
    public Currency getLatest(String appId) {
        System.out.println(currencyFeignClient.getLatest(appId));
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson=gsonBuilder.create();
        return gson.fromJson(currencyFeignClient.getLatest(appId),Currency.class);
    }

    @Override
    public List<Currency> getHistorical(String app_id,String date) {
        return currencyFeignClient.getHistorical(app_id,date);
    }
}
