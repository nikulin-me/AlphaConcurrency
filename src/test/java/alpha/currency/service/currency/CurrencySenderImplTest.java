package alpha.currency.service.currency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrencySenderImplTest {
    @Autowired
    private CurrencySender sender;

    @MockBean
    private CurrencyService service;

    @Test
    void shouldReturnTrueOrFalseDependingDelta() {
        when(service.getDeltaBetweenYesterdayAndNow("RUB")).thenReturn(10.0);
        assertTrue(sender.amIRich("RUB"));
    }
}