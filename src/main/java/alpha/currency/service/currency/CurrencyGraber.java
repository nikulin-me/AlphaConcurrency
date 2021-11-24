package alpha.currency.service.currency;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Timestamp;
import java.util.Map;

@Component
public final class CurrencyGraber {
    @Value("${appid}")
    private static final String appId="e1e243ae2b5f4b4494f092599741fe52";
    private static final String url="https://openexchangerates.org/api/";
    private static final String LATEST="latest.json?app_id=%s";
    private static final String HISTORICAL="historical/%s.json?app_id=%s";

    public static Map getData(String request) throws IOException {
        String urlString=String.format(url+request,appId);
        URLConnection connection=new URL(urlString).openConnection();
        connection.connect();
        JsonElement parseReader = JsonParser.parseReader(new InputStreamReader((InputStream) connection.getContent()));
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.fromJson(parseReader.getAsJsonObject().get("rates"), Map.class);
    }

    //https://openexchangerates.org/api/historical/2012-07-10.json?app_id=YOUR_APP_ID
    public static Map getYesterdayCurrency() throws IOException {
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis()-86_400*1000);
        String date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date (timeStamp.getTime()));
        System.out.println(date);
        String yesterday = String.format(HISTORICAL, date, appId);
        return getData(yesterday);
    }




    //https://openexchangerates.org/api/latest.json?app_id=YOUR_APP_ID
    public static Map getCurrencyNow() throws IOException {
        return getData(LATEST);
    }


}
