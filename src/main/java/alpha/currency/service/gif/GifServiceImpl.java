package alpha.currency.service.gif;

import alpha.currency.clients.GifFeignClient;
import alpha.currency.model.Gif;
import alpha.currency.service.currency.CurrencySender;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GifServiceImpl implements GifService {
    private final GifFeignClient gifFeignClient;

    @Value("${acc-key.giphy}")
    private String appGif;

    private final CurrencySender currencySender;

    @Override
    public Gif getGif(String currency) {
        log.info("Getting gif");
        return new Gson().fromJson(gifFeignClient.getGif(appGif, getEndpointDependingDelta(currency)),Gif.class);
    }


    /**
     *
     * @param currency
     * @return if delta+->/rich else: /broke
     */
    public String getEndpointDependingDelta(String currency){
        log.info("Getting endpoint depending of delta");
        boolean iRich = currencySender.amIRich(currency);
        if (iRich){
            return "rich";
        }
        else{
            return "broke";
        }
    }

}
