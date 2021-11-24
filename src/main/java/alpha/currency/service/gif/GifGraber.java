package alpha.currency.service.gif;

import alpha.currency.service.currency.Graber;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class GifGraber  {
    //api_key
    public static void main(String[] args) throws IOException {
        String url="https://api.giphy.com/v1/gifs/search?api_key=Fg5ZichfqPaNaXtBRycoWr9bCoT7WtYR&q=rich&offset=10";
        Map map = Graber.getAbstractData(url);
        System.out.println(map);
    }
}


// https://giphy.com/search/rich
//when increase

//https://giphy.com/search/broke
//when down
