package alpha.currency.service.gif;

import alpha.currency.service.currency.CurrencySender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class GifServiceImplTest {
    @Autowired
    private GifService gifService;


    @MockBean
    private CurrencySender sender;

    @Test
    void shouldGetGif() {
        assertNotNull(gifService.getGif("RUB"));
    }

    @Test
    void shouldReturnEndpointDependingOnDelta() {
        when(sender.amIRich("RUB")).thenReturn(true);
        when(sender.amIRich("ALL")).thenReturn(false);
        GifServiceImpl mock = mock(GifServiceImpl.class);
        when(mock.getEndpointDependingDelta("RUB")).thenReturn("rich");
        when(mock.getEndpointDependingDelta("ALL")).thenReturn("broke");
        assertAll(
                () -> assertEquals("rich", gifService.getEndpointDependingDelta("RUB")),
                () -> assertEquals("broke",gifService.getEndpointDependingDelta("ALL"))
        );
    }
}