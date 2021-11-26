package alpha.currency.feign;

import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Import(FeignClientsConfiguration.class)
public class APIController{

    private final APIService proxy;

    public APIController(APIService proxy) {
        this.proxy = proxy;
    }

    @GetMapping("/rest/v3.1/all")
    public List<Object> getCountries() {
        return proxy.getCountries();
    }

    @GetMapping("/products")
    public List<Object> getProducts() {
        return proxy.getProducts();
    }
}
