package alpha.currency.controller;

import alpha.currency.service.currency.CurrencyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CurrencyController {
    private final CurrencyService currencyService;

    /**
     * @param currency
     * @return delta between today and yesterday
     */
    @GetMapping(value = "/rates/{currency}")
    public Double getDelta(@PathVariable String currency) {
        log.info(String.format("Sending delta for %s", currency));
        return currencyService.getDeltaBetweenYesterdayAndNow(currency);
    }
}
