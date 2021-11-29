package alpha.currency.service.currency;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrencyServiceImplTest {
    @Autowired
    private CurrencyServiceImpl currencyService;

    @Value("${acc-key.exchange}")
    private String appId;

    @Test
    void getLatest() {
        CurrencyServiceImpl mock = mock(CurrencyServiceImpl.class);
        when(mock.getLatest(anyString(),anyString())).thenReturn(75.0);
        assertEquals(75.0,mock.getLatest(appId,"RUB"));
    }

    @Test
    void getHistorical() {
    }

    @Test
    void getDeltaBetweenYesterdayAndNow() {
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