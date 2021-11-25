package alpha.currency.feign;


import alpha.currency.service.sender.CurrencySender;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "currency",url="https://openexchangerates.org/")
public interface CurrencyClient {
    @RequestMapping(value="/currency", method = RequestMethod.GET)
    CurrencySender getCurrency(@RequestParam String value);
}
