package alpha.concurrency.model;

import com.google.gson.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

@Component
public class CurrencyGraber {
    @Value("${appid}")
    private String appId="e1e243ae2b5f4b4494f092599741fe52";
    private static final String url="https://openexchangerates.org/api/";
    private final String LATEST="latest.json?app_id=%s";


    //*https://openexchangerates.org/api/historical/2012-07-10.json?app_id=YOUR_APP_ID
    //         */
    public Map getData(String request) throws IOException {
        String urlString=String.format(url+LATEST,appId);
        URLConnection connection=new URL(urlString).openConnection();
        connection.connect();
        JsonElement parseReader = JsonParser.parseReader(new InputStreamReader((InputStream) connection.getContent()));
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.fromJson(parseReader.getAsJsonObject().get("rates"), Map.class);
    }

    //https://openexchangerates.org/api/historical/2012-07-10.json?app_id=YOUR_APP_ID
    /*public JsonObject getHistoricalCurrency(){

    }


    //https://openexchangerates.org/api/latest.json?app_id=YOUR_APP_ID
    public JsonObject getCurrencyNow(){

    }

     */
}
