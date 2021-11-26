package alpha.currency.controller;

import alpha.currency.service.AbstractCollector;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        String urlString=String.format("https://api.giphy.com/v1/gifs/search?api_key=Fg5ZichfqPaNaXtBRycoWr9bCoT7WtYR" +
                "&q=broke&limit=10");
        Map data = AbstractCollector.getAbstractData(urlString);
        List<?> data1 = (List<?>) data.get("data");
        Map<?,?>o= (Map<?, ?>) data1.get(0);
        Map<?,?> map= (Map<?, ?>) o.get("images");
        Map<String,String> mapOfUrl = (Map<String, String>) map.get("original");
        System.out.println(mapOfUrl.get("url"));
        InputStreamReader reader = new InputStreamReader(new URL( mapOfUrl.get("url")).openStream());
        byte[] bytes = new Gson().fromJson(reader, byte[].class);
        System.out.println(bytes);
    }
}
