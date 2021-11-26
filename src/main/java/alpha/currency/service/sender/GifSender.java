package alpha.currency.service.sender;

import alpha.currency.service.AbstractCollector;
import alpha.currency.service.collector.GifCollector;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@Service
public class GifSender {
    private GifCollector gifCollector;
    private CurrencySender currencySender;

    @Autowired
    public GifSender(GifCollector gifCollector, CurrencySender currencySender) {
        this.gifCollector = gifCollector;
        this.currencySender = currencySender;
    }

    public String getGifURL(String currency) throws IOException {
        boolean isRich = currencySender.amIRich(currency);
        if (isRich){
            return gifCollector.getRichGif();
        }
        else{
            return gifCollector.getBrokeGif();
        }
    }

    public byte[] getGif(String currency) throws Exception {
        URL url = new URL(getGifURL(currency));
        InputStreamReader reader = new InputStreamReader(url.openStream());
        System.out.println(reader);
        return new Gson().fromJson(reader,byte[].class);
    }
}
