package alpha.currency.service.currency;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface CurrencyService {
    Currency getLatest(String appId) throws JsonProcessingException;
    List<Currency> getHistorical(String app_id,String date);
}
