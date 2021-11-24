package alpha.currency;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableEncryptableProperties
@EnableFeignClients
@PropertySource(value = "classpath:application.properties")
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }
}
