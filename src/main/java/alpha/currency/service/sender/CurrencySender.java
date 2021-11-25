package alpha.currency.service.sender;

import alpha.currency.service.collector.CurrencyCollector;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class CurrencySender {

    private final CurrencyCollector currencyCollector;
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(CurrencySender.class);


    public CurrencySender(CurrencyCollector currencyCollector) {
        this.currencyCollector = currencyCollector;
    }

    public double getGifByCurrencyChanged(String currency) throws IOException {
        Map<String,Double> currencyNow = currencyCollector.getCurrencyNow();
        Map<String,Double> currencyYesterday = currencyCollector.getYesterdayCurrency();
        Double priceNow = currencyNow.get(currency);
        Double priceYesterday = currencyYesterday.get(currency);
        double v = priceNow - priceYesterday;
        logger.info("Delta between now`s and yesterday`s prices "+v);

        return v;
    }

    public boolean amIRich(String currency) throws IOException {
        return getGifByCurrencyChanged(currency) > 0;
    }
}
