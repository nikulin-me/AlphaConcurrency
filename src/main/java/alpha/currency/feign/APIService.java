package alpha.currency.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(name = "api-service",url = "https://restcountries.com")
public interface APIService {

    @GetMapping("/v3.1/all")
    List<Object> getCountries();

    @GetMapping("/products")
    List<Object> getProducts();
}
