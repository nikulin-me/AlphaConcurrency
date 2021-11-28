package alpha.currency.service.currency;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyService currencyService;

    @GetMapping("/latest.json")
    public Map<String, Double> getLatest(@RequestParam("app_id") String app_id) throws JsonProcessingException {
        return currencyService.getLatest(app_id);
    }

    @GetMapping("/historical/{timestamp}.json")
    public List<Currency> getHistorical(@RequestParam("app_id") String app_id
                                    , @PathVariable String timestamp){
        return currencyService.getHistorical(app_id,timestamp);
    }
}
