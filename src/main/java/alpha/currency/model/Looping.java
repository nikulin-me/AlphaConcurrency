
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Looping {

    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("mp4")
    @Expose
    private String mp4;

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
    }

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Looping.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mp4Size");
        sb.append('=');
        sb.append(((this.mp4Size == null)?"<null>":this.mp4Size));
        sb.append(',');
        sb.append("mp4");
        sb.append('=');
        sb.append(((this.mp4 == null)?"<null>":this.mp4));
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
        result = ((result* 31)+((this.mp4Size == null)? 0 :this.mp4Size.hashCode()));
        result = ((result* 31)+((this.mp4 == null)? 0 :this.mp4 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Looping) == false) {
            return false;
        }
        Looping rhs = ((Looping) other);
        return (((this.mp4Size == rhs.mp4Size)||((this.mp4Size!= null)&&this.mp4Size.equals(rhs.mp4Size)))&&((this.mp4 == rhs.mp4)||((this.mp4 != null)&&this.mp4 .equals(rhs.mp4))));
    }

}
