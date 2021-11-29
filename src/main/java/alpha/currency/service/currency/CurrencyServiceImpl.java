package alpha.currency.service.currency;

import alpha.currency.clients.CurrencyFeignClient;
import alpha.currency.exceptions.NonExistentCurrencyException;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyFeignClient currencyFeignClient;
    private final long YESTERDAY = 10;

    @Value("${acc-key.exchange}")
    private String appKey;


    @Override
    public Double getLatest(String currency) throws NonExistentCurrencyException {
        log.info(String.format("Getting latest price for %s ",currency));
        Double price = getCurrencies().get(currency);
        if (price ==null){
            throw new NonExistentCurrencyException(String.format("%s doesn't exist!",currency));
        }
        else {
            return price;
        }
    }

    @Override
    public Double getHistorical(String currency) throws NonExistentCurrencyException{
        log.info(String.format("Getting yesterday price for %s ",currency));
        Double price = getCurrenciesYesterday().get(currency);
        if (price ==null){
            throw new NonExistentCurrencyException(String.format("%s doesn`t exist!",currency));
        }
        else{
            return price;
        }
    }

    //Got all currencies prices today
    private Map<String, Double> getCurrencies() {
        Map map = new Gson().fromJson(currencyFeignClient.getLatest(appKey), Map.class);
        return (Map<String, Double>) map.get("rates");
    }

    //Got all currencies yesterday
    private Map<String, Double> getCurrenciesYesterday() {
        LocalDateTime now = LocalDateTime.now().minusDays(YESTERDAY);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = formatter.format(now);
        Map map = new Gson().fromJson(currencyFeignClient.getHistorical(appKey, format), Map.class);
        return (Map<String, Double>) map.get("rates");
    }

    //Delta
    public Double getDeltaBetweenYesterdayAndNow(String currency) {
        return getLatest(currency) - getHistorical(currency);
    }
}
