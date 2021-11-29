package alpha.currency.service.currency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class CurrencySenderImplTest {
    @Autowired
    private CurrencySender sender;

    @Test
    void amIRich() {
        CurrencySender mock = mock(CurrencySender.class);
        when(mock.amIRich("RUB")).thenReturn(true);
        assertEquals(mock.amIRich("RUB"),sender.amIRich("RUB"));
    }
}