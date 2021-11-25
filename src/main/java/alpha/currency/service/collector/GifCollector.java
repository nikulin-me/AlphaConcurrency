package alpha.currency.service.collector;

import alpha.currency.service.AbstractCollector;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class GifCollector {
    //api_key
    private static final Random random = new Random();
    public static void main(String[] args) throws Exception {
        String url = "https://api.giphy.com/v1/gifs/search?api_key=Fg5ZichfqPaNaXtBRycoWr9bCoT7WtYR&q=rich&limit=100";
        Map abstractData = AbstractCollector.getAbstractData(url);
        String url1 = getUrl(abstractData);
        System.out.println(url1);
    }

    private static String getUrl(Map data) {
        List<Map<String, String>> map = (List<Map<String, String>>) data.get("data");
        System.out.println(map.size());
        Map<String, String> mapOfData = map.get(random.nextInt(map.size()));
        return mapOfData.get("url");
    }
}


// https://giphy.com/search/rich
//when increase

//https://giphy.com/search/broke
//when down
