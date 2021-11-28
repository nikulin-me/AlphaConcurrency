package alpha.currency.service.currency;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CurrencyController {
    private final CurrencyService currencyService;

    @Value("${acc-key.exchange}")
    private String app_id;


    @GetMapping("/currency/{currency}")
    public Double getLatest(@PathVariable String currency) throws JsonProcessingException {
        return currencyService.getLatest(app_id,currency);
    }

    @GetMapping("/currency/{currency}/historical")
    public Double getHistorical(@PathVariable String currency){
        return currencyService.getHistorical(app_id, currency);
    }
}
