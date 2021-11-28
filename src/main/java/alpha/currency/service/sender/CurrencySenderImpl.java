package alpha.currency.service.sender;

import alpha.currency.model.Gif;
import alpha.currency.service.collector.CurrencyService;
import alpha.currency.service.collector.GifServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencySenderImpl implements CurrencySender{
    @Autowired
    private final CurrencyService currencyService;
    @Autowired
    private final GifServiceImpl gifService;

    @Value("${acc-key.giphy}")
    private String appGiph;

    @Override
    public boolean amIRich(String appId,String currency) {
        Double deltaBetweenYesterdayAndNow = currencyService.getDeltaBetweenYesterdayAndNow(appId, currency);
        return deltaBetweenYesterdayAndNow > 0;
    }

    @Override
    public Gif sendGif(String appId, String currency) {
        gifService.getGif(appGiph,currency);
        return null;
    }
}
