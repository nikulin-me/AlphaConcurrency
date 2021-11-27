package alpha.currency.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "gif-client",url = "api.giphy.com/v1/gifs/search")
public interface GifClient {

    @GetMapping("/")
    List<Object> getGifList(
            @RequestParam String q
    );
}
