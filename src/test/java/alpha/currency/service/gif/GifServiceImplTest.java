package alpha.currency.service.gif;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class GifServiceImplTest {
    @Autowired
    private GifService gifService;

    @Test
    void getGif() {

    }

    @Test
    void shouldReturnEndpointDependingOnDelta() {
        GifServiceImpl mock = mock(GifServiceImpl.class);
        when(mock.getEndpointDependingDelta("RUB")).thenReturn("rich");
        when(mock.getEndpointDependingDelta("ALL")).thenReturn("broke");
        assertAll(
                () -> assertEquals(mock.getEndpointDependingDelta("RUB"), gifService.getEndpointDependingDelta("RUB")),
                () ->assertEquals(mock.getEndpointDependingDelta("ALL"),gifService.getEndpointDependingDelta("ALL"))
        );
    }
}