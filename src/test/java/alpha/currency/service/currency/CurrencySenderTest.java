package alpha.currency.service.currency;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrencySenderTest {

    @Test
    void getCurrency() throws IOException {
        CurrencyGraber currencyGraber= mock(CurrencyGraber.class);
        Map<String,Double> rates=new HashMap<>(Map.of("RUB",90.0));
        Map<String, Double> ratesOld=new HashMap<>(Map.of("RUB",80.0));
        when(currencyGraber.getCurrencyNow()).thenReturn(rates);
        when(currencyGraber.getYesterdayCurrency()).thenReturn(ratesOld);
        CurrencySender currencySender = new CurrencySender(currencyGraber);
        assertEquals(10.0,currencySender.getCurrency("RUB"));
    }

    @Test
    void amIRich() {
    }
}