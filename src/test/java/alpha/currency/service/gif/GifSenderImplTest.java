package alpha.currency.service.gif;

import alpha.currency.model.Datum;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
class GifSenderImplTest {
    @Autowired
    private GifSender sender;

    @Rule
    public WireMockServer wireMock=new WireMockServer(options().extensions(new ResponseTemplateTransformer(true)).port(8008));


    @Test
    void getGirUrlByCurrency() {
        assertNotNull(sender.getGirUrlByCurrency("RUB"));
    }

    @Test
    void getGifByCurrency() {
        assertEquals(Datum.class,sender.getGifByCurrency("RUB").getClass());
    }
}