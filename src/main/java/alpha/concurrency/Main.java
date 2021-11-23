package alpha.concurrency;

import com.google.gson.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws IOException {
        String appId="e1e243ae2b5f4b4494f092599741fe52";
        final String url = "https://openexchangerates.org/api/";
        final String LATEST = "latest.json?app_id=%s";

        /*https://openexchangerates.org/api/historical/2012-07-10.json?app_id=YOUR_APP_ID
         */

        String urlString = String.format(url + LATEST, appId);
        URLConnection connection = new URL(urlString).openConnection();
        connection.connect();
        JsonElement parseReader = JsonParser.parseReader(new InputStreamReader((InputStream) connection.getContent()));
        JsonElement rates = parseReader.getAsJsonObject().get("rates");
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Map map=gson.fromJson(rates,Map.class);
        System.out.println(map.get("ALL"));
    }
}
