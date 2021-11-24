package alpha.currency.service.currency;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class CurrencySender {

    private final CurrencyGraber currencyGraber;
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(CurrencySender.class);


    public CurrencySender(CurrencyGraber currencyGraber) {
        this.currencyGraber = currencyGraber;
    }

    public double getCurrency(String currency) throws IOException {
        Map<String,Double> currencyNow = currencyGraber.getCurrencyNow();
        Map<String,Double> currencyYesterday = currencyGraber.getYesterdayCurrency();
        Double priceNow = currencyNow.get(currency);
        Double priceYesterday = currencyYesterday.get(currency);
        double v = priceNow - priceYesterday;
        logger.info("Delta between now`s and yesterday`s prices "+v);

        return v;
    }

    public boolean amIRich(String currency) throws IOException {
        return getCurrency(currency) > 0;
    }
}
