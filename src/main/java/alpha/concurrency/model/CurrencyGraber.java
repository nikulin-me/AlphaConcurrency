package alpha.concurrency.model;

import com.google.gson.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Map;

@Component
public class CurrencyGraber {
    @Value("${appid}")
    private String appId="e1e243ae2b5f4b4494f092599741fe52";
    private static final String url="https://openexchangerates.org/api/";
    private final String LATEST="latest.json?app_id=%s";
    private final String HISTORICAL="historical/%s.json?app_id=%s";

    public Map getData(String request) throws IOException {
        String urlString=String.format(url+request,appId);
        URLConnection connection=new URL(urlString).openConnection();
        connection.connect();
        JsonElement parseReader = JsonParser.parseReader(new InputStreamReader((InputStream) connection.getContent()));
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return gson.fromJson(parseReader.getAsJsonObject().get("rates"), Map.class);
    }

    //https://openexchangerates.org/api/historical/2012-07-10.json?app_id=YOUR_APP_ID
    public Map getYesterdayCurrency() throws IOException {
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis()-86_400*1000);
        String date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date (timeStamp.getTime()));
        System.out.println(date);
        String yesterday = String.format(HISTORICAL, date, appId);
        return getData(yesterday);
    }




    //https://openexchangerates.org/api/latest.json?app_id=YOUR_APP_ID
    public Map getCurrencyNow() throws IOException {
        return getData(LATEST);
    }


}
