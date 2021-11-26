package alpha.currency.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "api-service")
public interface APIService {

    @GetMapping("/v3.1/all")
    List<Object> getCountries();

    @GetMapping("/products")
    List<Object> getProducts();
}
