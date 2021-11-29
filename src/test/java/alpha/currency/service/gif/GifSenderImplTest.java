package alpha.currency.service.gif;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GifSenderImplTest {

    @Value("${url.giphy}")
    private String appGif;

    @Rule
    public WireMockServer wireMockServer=new WireMockServer(options().extensions(new ResponseTemplateTransformer(true)).port(8008));


    @Test
    void getGifByCurrency() {
    }
}