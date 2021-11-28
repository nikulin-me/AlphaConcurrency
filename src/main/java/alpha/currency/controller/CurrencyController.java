package alpha.currency.controller;

import alpha.currency.service.collector.CurrencyService;
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
    private String appId;

    @GetMapping("/currency/{currency}")
    public Double getDelta(@PathVariable String currency){
        return currencyService.getDeltaBetweenYesterdayAndNow(appId,currency);
    }
}