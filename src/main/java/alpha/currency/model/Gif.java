
package alpha.currency.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Gif {

    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gif.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("pagination");
        sb.append('=');
        sb.append(((this.pagination == null)?"<null>":this.pagination));
        sb.append(',');
        sb.append("meta");
        sb.append('=');
        sb.append(((this.meta == null)?"<null>":this.meta));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.pagination == null)? 0 :this.pagination.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.meta == null)? 0 :this.meta.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gif) == false) {
            return false;
        }
        Gif rhs = ((Gif) other);
        return ((((this.pagination == rhs.pagination)||((this.pagination!= null)&&this.pagination.equals(rhs.pagination)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.meta == rhs.meta)||((this.meta!= null)&&this.meta.equals(rhs.meta))));
    }

}
