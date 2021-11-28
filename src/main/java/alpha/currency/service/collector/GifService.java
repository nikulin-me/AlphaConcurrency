package alpha.currency.service.collector;



public interface GifService {
    model.Gif getGif(String appId, String request);
    String getRequestByDelta(String currency);
}
