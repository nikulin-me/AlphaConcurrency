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

@Service
@RequiredArgsConstructor
@Slf4j
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyFeignClient currencyFeignClient;
    private final long YESTERDAY = 1;

    @Value("${acc-key.exchange}")
    private String appKeyRates;


    /**
     * @param currency- ISO 4217(сокращения имён всех стран)- валюта
     * @return today price requested currency
     */
    @Override
    public Double getLatest(String currency) throws NonExistentCurrencyException {
        log.info(String.format("Getting latest price for %s ",currency));
        Double price = getRates().get(currency);
        if (price ==null){
            log.error(String.format("%s is not present",currency));
            throw new NonExistentCurrencyException(String.format("%s doesn't exist!",currency));
        }
        else {
            return price;
        }
    }

    /**
     * @return yesterday price requested currency
     */
    @Override
    public Double getHistorical(String currency) throws NonExistentCurrencyException{
        log.info(String.format("Getting yesterday price for %s ",currency));
        Double price = getRatesYesterday().get(currency);
        if (price ==null){
            throw new NonExistentCurrencyException(String.format("%s doesn`t exist!",currency));
        }
        else{
            return price;
        }
    }

    /**
     * @return  Got all currencies prices today
     */
    private Map<String, Double> getRates() {
        Map map = new Gson().fromJson(currencyFeignClient.getLatest(appKeyRates), Map.class);
        return (Map<String, Double>) map.get("rates");
    }

    /**
     * @return Got all currencies yesterday
     */
    private Map<String, Double> getRatesYesterday() {
        LocalDateTime now = LocalDateTime.now().minusDays(YESTERDAY);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = formatter.format(now);
        Map map = new Gson().fromJson(currencyFeignClient.getHistorical(appKeyRates, format), Map.class);
        return (Map<String, Double>) map.get("rates");
    }

    /**
     * @return delta price between today and yesterday
     */
    public Double getDeltaBetweenYesterdayAndNow(String currency) {
        log.info(String.format("Calculating delta for %s",currency));
        return getLatest(currency) - getHistorical(currency);
    }
}
