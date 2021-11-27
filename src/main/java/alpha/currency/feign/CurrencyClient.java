package alpha.currency.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "currency-client",url = "https://openexchangerates.org/api/")
//https://openexchangerates.org/api/latest.json
//                                             ?app_id=YOUR_APP_ID
//                                             &base=GBP
public interface CurrencyClient {
    @GetMapping("/latest.json")
    List<Object> getLatest(@RequestParam("app_id") String appId);

    @GetMapping("/historical/{timestamp}.json")
    List<Object> getHistorical(@PathVariable("timestamp") String date,
                                @RequestParam("app_id") String appId);
}

//https://openexchangerates.org/api/
//                                  latest.json
//                                  currencies.json
//                                  historical/2013-02-16.json