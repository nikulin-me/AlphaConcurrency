package alpha.currency.service.gif;

import alpha.currency.model.Datum;
import alpha.currency.model.Gif;

public interface GifSender {
    String getGirUrlByCurrency(String currency);

    Datum getGifByCurrency(String currency);
}
