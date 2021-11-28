package alpha.currency.service.currency;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Map;

public interface CurrencyService {
    Map<String, Double> getLatest(String appId) throws JsonProcessingException;
    List<Currency> getHistorical(String app_id,String date);
}
