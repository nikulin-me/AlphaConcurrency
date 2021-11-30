package alpha.currency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Currency {
    private HashMap<String, Double> rates;
}
