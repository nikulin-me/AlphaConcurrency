package alpha.currency.service.collector;

import alpha.currency.service.AbstractCollector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class GifCollector {
    //api_key
    @Value("${acc-key.giphy}")
    private String appId;

    private final String q="?q=%s";
    private final String broke="broke";
    private final String rich="rich";

    private final String url="https://api.giphy.com/v1/gifs/search";
    private final String appUrl="&api_key=%s";

    private static final Random random = new Random();


    private  String getUrl(String request) throws IOException {
        String urlString=String.format(url+q+appUrl,request,appId);
        Map data = AbstractCollector.getAbstractData(urlString);
        List<Map<String, String>> map = (List<Map<String, String>>) data.get("data");
        Map<String, String> mapOfData = map.get(random.nextInt(map.size()));
        return mapOfData.get("url");
    }
    //https://giphy.com/search/broke
    //when down
    public String getBrokeGif() throws IOException {
        return getUrl(broke);
    }


    // https://giphy.com/search/rich
    //when increase
    public String getRichGif() throws IOException {
        return getUrl(rich);
    }
}





