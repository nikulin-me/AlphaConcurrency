package alpha.currency;

import alpha.currency.service.currency.CurrencyGraber;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws IOException {
        CurrencyGraber currencyGraber = new CurrencyGraber();
        System.out.println(currencyGraber.getYesterdayCurrency());
        System.out.println(currencyGraber.getCurrencyNow());
    }
}
