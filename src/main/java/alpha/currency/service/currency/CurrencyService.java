package alpha.currency.service.currency;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.util.Map;

public interface CurrencyService {
    Double getLatest(String currency);
    Double getHistorical(String currency);
    Double getDeltaBetweenYesterdayAndNow(String currency);
}
