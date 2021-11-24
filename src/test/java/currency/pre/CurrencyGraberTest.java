package currency.pre;

import alpha.currency.service.currency.CurrencyGraber;
import alpha.currency.service.currency.CurrencySender;
import org.junit.Test;

import java.io.IOException;

public class CurrencyGraberTest extends AbstractCurrency{
    public CurrencyGraberTest() throws IOException {
        super();
    }

    @Test
    public void getYesterday() throws IOException {
        CurrencySender currencySender = new CurrencySender();
        boolean all = currencySender.amIRich("UYU");
        System.out.println(currencySender.getCurrency("UYU"));
        System.out.println(all);
    }
}
