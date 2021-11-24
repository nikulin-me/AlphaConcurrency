package currency;

import alpha.currency.service.currency.CurrencyGraber;
import alpha.currency.service.currency.CurrencySender;
import currency.pre.AbstractCurrency;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CurrencyGraberTest extends AbstractCurrency {
    @Mock
    private CurrencyGraber currencyGraber;

    @InjectMocks
    private CurrencySender currencySender;


    public CurrencyGraberTest() {
        super();
    }

    @Test
    public void testGetYesterday() throws IOException {
        Mockito.when(currencySender.getCurrency("ALL")).thenReturn(3.64);
        Assert.assertEquals(3.64,currencySender.getCurrency("ALL"));
    }
}
