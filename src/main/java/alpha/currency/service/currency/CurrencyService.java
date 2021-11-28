package alpha.currency.service.currency;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Map;

public interface CurrencyService {
    Double getLatest(String appId,String currency) throws JsonProcessingException;
    Double getHistorical(String app_id,String currency);
}
