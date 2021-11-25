package alpha.currency.service.collector;

import alpha.currency.service.AbstractCollector;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Map;

@Service
//This class get data about currency
public class CurrencyCollector {
    @Value("${acc-key.exchange}")
    private String appId;

    private final String url = "https://openexchangerates.org/api/";
    private final String LATEST = "latest.json?app_id=%s";
    private final String HISTORICAL = "historical/%s.json?app_id=%s";
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CurrencyCollector.class);


    //handle and convert to map data from api
    public Map<String, Double> getData(String request) throws IOException {
        String urlString = String.format(url + request, appId);
        logger.info("Getting data from exchange " + request);
        Map abstractData = AbstractCollector.getAbstractData(urlString);
        return (Map<String, Double>) abstractData.get("rates");
    }

    //get yesterday price
    //https://openexchangerates.org/api/historical/2012-07-10.json?app_id=YOUR_APP_ID
    public Map<String, Double> getYesterdayCurrency() throws IOException {
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis() - 86_400 * 1000);
        String date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date(timeStamp.getTime()));
        String yesterday = String.format(HISTORICAL, date, appId);
        logger.info("Getting price yesterday");
        return getData(yesterday);
    }


    //get today price
    //https://openexchangerates.org/api/latest.json?app_id=YOUR_APP_ID
    public Map<String, Double> getCurrencyNow() throws IOException {
        logger.info("Getting price now");
        return getData(LATEST);
    }
}
