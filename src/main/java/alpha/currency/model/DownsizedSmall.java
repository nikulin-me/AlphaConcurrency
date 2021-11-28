
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DownsizedSmall {

    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("mp4")
    @Expose
    private String mp4;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

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
        sb.append(DownsizedSmall.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
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
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.mp4Size == null)? 0 :this.mp4Size.hashCode()));
        result = ((result* 31)+((this.mp4 == null)? 0 :this.mp4 .hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DownsizedSmall) == false) {
            return false;
        }
        DownsizedSmall rhs = ((DownsizedSmall) other);
        return (((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.mp4Size == rhs.mp4Size)||((this.mp4Size!= null)&&this.mp4Size.equals(rhs.mp4Size))))&&((this.mp4 == rhs.mp4)||((this.mp4 != null)&&this.mp4 .equals(rhs.mp4))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
