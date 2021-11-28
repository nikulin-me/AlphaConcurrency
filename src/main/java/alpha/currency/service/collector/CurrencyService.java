package alpha.currency.service.collector;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Map;

public interface CurrencyService {
    Double getLatest(String appId,String currency) throws JsonProcessingException;
    Double getHistorical(String appId,String currency);
    Double getDeltaBetweenYesterdayAndNow(String appId,String currency);
}
