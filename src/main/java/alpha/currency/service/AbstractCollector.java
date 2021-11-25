package alpha.currency.service;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

@Service
public abstract class AbstractCollector {
    public static Map getAbstractData(String url) throws IOException {
        InputStreamReader reader = new InputStreamReader(new URL(url).openStream());
        return new Gson().fromJson(reader,Map.class);
    }
}