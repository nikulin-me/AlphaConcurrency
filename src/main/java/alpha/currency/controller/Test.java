package alpha.currency.controller;

import alpha.currency.service.AbstractCollector;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {

        String webPage = "https://api.giphy.com/v1/gifs/search?q=broke&api_key=Fg5ZichfqPaNaXtBRycoWr9bCoT7WtYR&limit=2";

        Map<?,?> data = AbstractCollector.getAbstractData(webPage);
        System.out.println(data);
        System.out.println(data.get("data"));
        List<?> data1 = (List<?>) data.get("data");
        Map<?,?> map= (Map<?, ?>) data1.get(0);
        System.out.println(map.get("images"));
        Map<?,?> images = (Map<?, ?>) map.get("images");
        Map<?,?> downsized = (Map<?, ?>) images.get("downsized");
        System.out.println(downsized.get("url"));
    }
}
