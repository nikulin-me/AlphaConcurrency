package currency.pre;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class CurrencyGraberTest{

    @Test
    public void getYesterday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis()-86_400*1000);
        Date date = new Date(timeStamp.getTime());
        System.out.println(dtf.format((TemporalAccessor) date));

    }
}
