package alpha.currency.service.sender;

import alpha.currency.service.collector.GifCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

@Service
public class GifSender {
    private GifCollector gifCollector;
    private CurrencySender currencySender;

    @Autowired
    public GifSender(GifCollector gifCollector, CurrencySender currencySender) {
        this.gifCollector = gifCollector;
        this.currencySender = currencySender;
    }

    public String getGifURLDependingDelta(String currency) throws IOException {
        boolean isRich = currencySender.amIRich(currency);
        if (isRich){
            return gifCollector.getRichGif();
        }
        else{
            return gifCollector.getBrokeGif();
        }
    }

    public byte[] getGif(String currency) throws IOException {
        URL url = new URL(getGifURLDependingDelta(currency));
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try (InputStream inputStream = url.openStream()) {
            int n = 0;
            byte [] buffer = new byte[9999999];
            while (-1 != (n = inputStream.read(buffer))) {
                output.write(buffer, 0, n);
            }
        }
        return output.toByteArray();
    }


    /*public URI getGif(String currency) throws Exception {
        URL url = new URL(getGifURLDependingDelta(currency));
        InputStreamReader reader = new InputStreamReader(url.openStream());
        while (reader.ready()){
            System.out.println(reader.read());
        }
        URI uri = URI.create(URLEncoder.encode(String.valueOf(new Gson().fromJson(reader, URI.class)), StandardCharsets.UTF_8));
        System.out.println(uri.toURL());
        return uri;
    }*/
}
