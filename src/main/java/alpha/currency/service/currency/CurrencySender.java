package alpha.currency.service.currency;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class CurrencySender {

    private final CurrencyGraber currencyGraber;

    public CurrencySender(CurrencyGraber currencyGraber) {
        this.currencyGraber = currencyGraber;
    }

    public double getCurrency(String currency) throws IOException {
        Map<String,Double> currencyNow = currencyGraber.getCurrencyNow();
        Map<String,Double> currencyYesterday = currencyGraber.getYesterdayCurrency();
        Double priceNow = currencyNow.get(currency);
        Double priceYesterday = currencyYesterday.get(currency);

        return priceNow-priceYesterday;
    }

    public boolean amIRich(String currency) throws IOException {
        return getCurrency(currency) > 0;
    }
}
