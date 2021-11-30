package alpha.currency.clients;

import alpha.currency.controller.CurrencyController;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@EnableConfigurationProperties
@ActiveProfiles("test")
class CurrencyFeignClientTest {


    @BeforeAll
    static void init() {
        WireMockServer wireMockServer = new WireMockServer(
                new WireMockConfiguration().port(8081)
        );
        wireMockServer.start();
        WireMock.configureFor("localhost", 8081);
    }


    @Test
    void getLatest() throws Exception {
        stubFor(WireMock.get(urlPathEqualTo("/latest.json"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody(String.valueOf(okJson(String.valueOf(Double.MAX_VALUE))))
                        .withStatus(200)));

        String url = "http://localhost:8081/latest.json";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        client.execute(request);


        verify(getRequestedFor(urlPathEqualTo("/latest.json"))
                .withHeader("Content-Type", equalTo("application/json")));
    }

    @Test
    void getHistorical() throws IOException {
        stubFor(WireMock.get(urlPathEqualTo("/historical/11232341/.json"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody(String.valueOf(okJson(String.valueOf(Double.MAX_VALUE))))
                        .withStatus(200)));

        String url = "http://localhost:8081/historical/11232341.json";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("Content-Type", "application/json");
        request.addHeader("Accept", "application/json");
        client.execute(request);


        verify(getRequestedFor(urlPathEqualTo("/historical/11232341.json"))
                .withHeader("Content-Type", equalTo("application/json")));
    }
}
