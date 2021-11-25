package alpha.currency.service.sender;

import alpha.currency.service.collector.GifCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GifSender {
    private GifCollector gifCollector;
    private CurrencySender currencySender;

    @Autowired
    public GifSender(GifCollector gifCollector, CurrencySender currencySender) {
        this.gifCollector = gifCollector;
        this.currencySender = currencySender;
    }

    public String getGif(String currency) throws IOException {
        boolean isRich = currencySender.amIRich(currency);
        if (isRich){
            return gifCollector.getRichGif();
        }
        else{
            return gifCollector.getBrokeGif();
        }
    }
}
