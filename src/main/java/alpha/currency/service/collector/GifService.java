package alpha.currency.service.collector;

import alpha.currency.model.Datum;
import alpha.currency.model.Gif;

import java.util.List;

public interface GifService {
    Gif getGif(String appId, String request);
    String getRequestByDelta(String currency);
}
