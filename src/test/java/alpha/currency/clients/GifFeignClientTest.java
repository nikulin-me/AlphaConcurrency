package alpha.currency.clients;

import alpha.currency.WireMockConfig;
import alpha.currency.service.gif.GifSender;
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

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { WireMockConfig.class })
@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties
class GifFeignClientTest {
    @Value("${acc-key.giphy}")
    private String appId;


    @MockBean
    private GifFeignClient feignClient;

    @Test
    void getGif() {
        assertFalse(feignClient.getGif(appId,"rich").isEmpty());
    }
}