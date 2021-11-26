package alpha.currency.service.collector;

import alpha.currency.service.AbstractCollector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class GifCollector {
    //api_key
    @Value("${acc-key.giphy}")
    private String appId;

    //https://api.giphy.com/v1/gifs/search?q=broke&api_key=Fg5ZichfqPaNaXtBRycoWr9bCoT7WtYR
    private final String q="?q=%s";
    private final String broke="broke";
    private final String rich="rich";

    private final String url="https://api.giphy.com/v1/gifs/search";
    private final String appUrl="&api_key=%s";

    private static final Random random = new Random();


    private  String getUrl(String request) throws IOException {
        String urlString=String.format(url+q+appUrl,request,appId);
        Map<?,?> data = AbstractCollector.getAbstractData(urlString);
        List<?> data1 = (List<?>) data.get("data");
        Map<?,?> map= (Map<?, ?>) data1.get(0);
        Map<?,?> images = (Map<?, ?>) map.get("images");
        Map<?,?> downsized = (Map<?, ?>) images.get("downsized");
        return (String) downsized.get("url");
        /*https://media4.giphy.com/media/YsTs5ltWtEhnq/giphy.gif?cid=790b761145e66c709e29f991b8627365e2a5a44350557489&rid=giphy.gif&ct=g*/
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





