package alpha.currency.service.currency;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class CurrencySender {


    public double getCurrency(String currency) throws IOException {
        Map currencyNow = CurrencyGraber.getCurrencyNow();
        Map currencyYesterday = CurrencyGraber.getYesterdayCurrency();
        Double priceNow = (Double) currencyNow.get(currency);
        Double priceYesterday = (Double) currencyYesterday.get(currency);

        return priceNow-priceYesterday;
    }

    public boolean amIRich(String currency) throws IOException {
        return getCurrency(currency) > 0;
    }
}
