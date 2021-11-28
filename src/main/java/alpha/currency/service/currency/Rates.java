package alpha.currency.service.currency;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.util.Map;

@Generated("jsonschema2pojo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rates {
    @JsonProperty("rates")
    Map<String, String> base;
}
