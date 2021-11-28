package alpha.currency.service.sender;

import alpha.currency.model.Gif;
import alpha.currency.service.collector.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencySenderImpl implements CurrencySender{
    @Autowired
    private final CurrencyService currencyService;

    @Value("${acc-key.giphy}")
    private String appGiph;

    @Override
    public boolean amIRich(String appId,String currency) {
        Double deltaBetweenYesterdayAndNow = currencyService.getDeltaBetweenYesterdayAndNow(appId, currency);
        return deltaBetweenYesterdayAndNow > 0;
    }
}
