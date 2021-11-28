package alpha.currency.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gif-client",url = "${url.giphy}")
public interface GifFeignClient {
    @GetMapping()
    String getGif(@RequestParam("api_key") String appId,
                      @RequestParam("q") String request);

}
