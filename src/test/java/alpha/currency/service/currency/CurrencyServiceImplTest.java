package alpha.currency.service.currency;

import alpha.currency.exceptions.NonExistentCurrencyException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrencyServiceImplTest {
    @Autowired
    private CurrencyServiceImpl currencyService;

    @Value("${acc-key.exchange}")
    private String appId;

    @Test
    void shouldReturnCurrencyLatest() {
        assertNotNull(currencyService.getLatest( "RUB"));
    }

    @Test
    void shouldReturnNonExistentCurrencyExceptionNow() {
        assertThrows(NonExistentCurrencyException.class, () -> currencyService.getLatest("NONE"));
    }

    @Test
    void shouldReturnNonExistentCurrencyExceptionYesterday() {
        assertThrows(NonExistentCurrencyException.class, () -> currencyService.getHistorical( "NONE"));
    }

    @Test
    void shouldReturnDelta() {
        CurrencyServiceImpl mock = mock(CurrencyServiceImpl.class);

    }
}


/*@Test
    void getCurrency() throws IOException {
        /*CurrencyCollector currencyGraber= mock(CurrencyCollector.class);
        Map<String,Double> rates=new HashMap<>(Map.of("RUB",90.0));
        Map<String, Double> ratesOld=new HashMap<>(Map.of("RUB",80.0));
        when(currencyGraber.getCurrencyNow()).thenReturn(rates);
        when(currencyGraber.getYesterdayCurrency()).thenReturn(ratesOld);
        *//*CurrencySender currencySender = new CurrencySender(currencyGraber);
        assertEquals(10.0,currencySender.getGifByCurrencyChanged("RUB"));*/