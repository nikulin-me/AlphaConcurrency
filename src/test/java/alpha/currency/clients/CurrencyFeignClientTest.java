package alpha.currency.clients;

import alpha.currency.WireMockConfig;
import alpha.currency.service.currency.CurrencyService;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { WireMockConfig.class })
@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties
class CurrencyFeignClientTest {
    @Value("${acc-key.exchange}")
    private String appID;

    @Autowired
    private CurrencyFeignClient feignClient;

    @Autowired
    private CurrencyService service;


    @Test
    void getLatest() {
        System.out.println(feignClient.getLatest(appID));
        assertTrue(feignClient.getLatest(appID).length()>1000);
    }

    @Test
    void getHistorical() {
        assertTrue(feignClient.getHistorical(appID,"2021-11-28").length()>1000);
    }
}