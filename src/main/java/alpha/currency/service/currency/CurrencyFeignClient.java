package alpha.currency.service.currency;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "currency-client",url = "https://openexchangerates.org/api/")
public interface CurrencyFeignClient {

    @GetMapping("/latest.json")
    String getLatest(@RequestParam("app_id") String appId);

    @GetMapping("/historical/{timestamp}.json")
    String getHistorical(@RequestParam("app_id") String appId,
                        @PathVariable("timestamp") String date);
}
