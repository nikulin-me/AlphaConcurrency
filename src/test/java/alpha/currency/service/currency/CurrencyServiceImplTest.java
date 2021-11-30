package alpha.currency.service.currency;

import alpha.currency.exceptions.NonExistentCurrencyException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrencyServiceImplTest {
    @Autowired
    private CurrencyService currencyService;

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
        Double latest = currencyService.getLatest("RUB");
        Double historical = currencyService.getHistorical("RUB");
        assertEquals(latest-historical,currencyService.getDeltaBetweenYesterdayAndNow("RUB"));
    }
}