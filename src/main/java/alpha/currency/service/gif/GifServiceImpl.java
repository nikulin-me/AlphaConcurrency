package alpha.currency.service.gif;

import alpha.currency.clients.GifFeignClient;
import alpha.currency.model.Gif;
import alpha.currency.service.currency.CurrencySender;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GifServiceImpl implements GifService {
    private final GifFeignClient gifFeignClient;

    @Value("${acc-key.exchange}")
    private String appRates;

    private final CurrencySender currencySender;

    @Override
    public Gif getGif(String appId, String currency) {
        return new Gson().fromJson(gifFeignClient.getGif(appId,getRequestByDelta(currency)),Gif.class);
    }

    /**
     *
     * @param currency
     * @return if delta+->/rich else: /broke
     */
    public String getRequestByDelta(String currency){
        boolean iRich = currencySender.amIRich(appRates, currency);
        if (iRich){
            return "rich";
        }
        else{
            return "broke";
        }
    }

}
