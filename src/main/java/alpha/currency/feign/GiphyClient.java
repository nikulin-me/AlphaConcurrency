package alpha.currency.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "giphy",url="https://api.giphy.com/v1/gifs/search")
public interface GiphyClient {
}
