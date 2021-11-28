package alpha.currency.service.currency;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "currencySenderV2")
@RequiredArgsConstructor
public class CurrencySender {
    @Autowired
    private CurrencyServiceImpl service;

    /*public Double getDeltaByCurrency(String currency){
        service.getLatest()
    }*/
}
