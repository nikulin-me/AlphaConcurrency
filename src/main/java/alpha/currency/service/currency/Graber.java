package alpha.currency.service.currency;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

@Service
public final class Graber{
    private static String appId="e1e243ae2b5f4b4494f092599741fe52";
    private static final String url = "https://openexchangerates.org/api/";
    private static final String LATEST = "latest.json?app_id=%s";
    public static Map getAbstractData(String url) throws IOException {
        URLConnection connection = new URL(url).openConnection();
        connection.connect();
        JsonElement parseReader = JsonParser.parseReader(new InputStreamReader((InputStream) connection.getContent()));
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.fromJson(parseReader.getAsJsonObject(),Map.class);
    }

    public static void main(String[] args) throws IOException {
        String urlString = String.format(url + LATEST, appId);
        Map abstractData1 = Graber.getAbstractData(urlString);
        System.out.println(abstractData1.get("rates"));

    }
}