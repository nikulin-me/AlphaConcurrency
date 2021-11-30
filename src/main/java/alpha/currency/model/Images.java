
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Generated("jsonschema2pojo")
@Data
public class Images {

    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;




}
