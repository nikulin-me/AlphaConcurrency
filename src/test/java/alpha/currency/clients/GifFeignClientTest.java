package alpha.currency.clients;


import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@EnableConfigurationProperties
@ActiveProfiles("test")
class GifFeignClientTest {

    @BeforeAll
    static void init() {
        WireMockServer wireMockServer = new WireMockServer(
                new WireMockConfiguration().port(8082)
        );
        wireMockServer.start();
        WireMock.configureFor("localhost", 8082);
    }

    @Test
    void getGif() {
        stubFor(WireMock.get(urlMatching("/latest.json"))
                .willReturn(aResponse()
                        .withStatus(200)));

        /*mockMvc.perform((RequestBuilder) get("/currency?currency=RUB"))
                .andExpect();*/

        verify(getRequestedFor(urlPathEqualTo("/latest.json")));
    }
}