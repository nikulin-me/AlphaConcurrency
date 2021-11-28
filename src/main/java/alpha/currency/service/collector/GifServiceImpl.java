package alpha.currency.service.collector;

import alpha.currency.clients.GifFeignClient;
import alpha.currency.model.Datum;
import alpha.currency.model.Gif;
import alpha.currency.service.sender.CurrencySender;
import alpha.currency.service.sender.CurrencySenderImpl;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GifServiceImpl implements GifService {
    private final GifFeignClient gifFeignClient;

    @Value("${acc-key.exchange}")
    private final String appRates;

    private final CurrencySender service;

    @Override
    public Gif getGif(String appId, String request) {
        return new Gson().fromJson(gifFeignClient.getGif(appId,request),Gif.class);
    }

    public String getRequestByDelta(String currency){
        boolean iRich = service.amIRich(appRates, currency);
        if (iRich){
            return "rich";
        }
        else{
            return "broke";
        }
    }

}
