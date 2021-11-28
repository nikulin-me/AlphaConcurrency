
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Analytics {

    @SerializedName("onload")
    @Expose
    private Onload onload;
    @SerializedName("onclick")
    @Expose
    private Onclick onclick;
    @SerializedName("onsent")
    @Expose
    private Onsent onsent;

    public Onload getOnload() {
        return onload;
    }

    public void setOnload(Onload onload) {
        this.onload = onload;
    }

    public Onclick getOnclick() {
        return onclick;
    }

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }

    public Onsent getOnsent() {
        return onsent;
    }

    public void setOnsent(Onsent onsent) {
        this.onsent = onsent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Analytics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("onload");
        sb.append('=');
        sb.append(((this.onload == null)?"<null>":this.onload));
        sb.append(',');
        sb.append("onclick");
        sb.append('=');
        sb.append(((this.onclick == null)?"<null>":this.onclick));
        sb.append(',');
        sb.append("onsent");
        sb.append('=');
        sb.append(((this.onsent == null)?"<null>":this.onsent));
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
        result = ((result* 31)+((this.onsent == null)? 0 :this.onsent.hashCode()));
        result = ((result* 31)+((this.onload == null)? 0 :this.onload.hashCode()));
        result = ((result* 31)+((this.onclick == null)? 0 :this.onclick.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Analytics) == false) {
            return false;
        }
        Analytics rhs = ((Analytics) other);
        return ((((this.onsent == rhs.onsent)||((this.onsent!= null)&&this.onsent.equals(rhs.onsent)))&&((this.onload == rhs.onload)||((this.onload!= null)&&this.onload.equals(rhs.onload))))&&((this.onclick == rhs.onclick)||((this.onclick!= null)&&this.onclick.equals(rhs.onclick))));
    }

}
