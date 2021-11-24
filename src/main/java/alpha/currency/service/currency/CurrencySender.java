package alpha.currency.service.currency;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

@Component
public class CurrencySender {


    public BigDecimal getCurrency(String currency) throws IOException {
        Map currencyNow = CurrencyGraber.getCurrencyNow();
        Map currencyYesterday = CurrencyGraber.getYesterdayCurrency();
        BigDecimal priceNow = (BigDecimal) currencyNow.get(currency);
        BigDecimal priceYesterday = (BigDecimal) currencyYesterday.get(currency);

        return priceNow.subtract(priceYesterday);
    }

    public boolean amIRich(String currency) throws IOException {
        int delta = getCurrency(currency).intValue();
        return delta > 0;
    }
}
