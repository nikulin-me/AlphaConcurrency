package alpha.currency.service.currency;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencySenderImpl implements CurrencySender{
    private final CurrencyService currencyService;

    @Override
    public boolean amIRich(String appId,String currency) {
        Double deltaBetweenYesterdayAndNow = currencyService.getDeltaBetweenYesterdayAndNow(currency);
        return deltaBetweenYesterdayAndNow > 0;
    }
}
