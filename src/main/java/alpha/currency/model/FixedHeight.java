
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class FixedHeight {

    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;
    @SerializedName("webp")
    @Expose
    private String webp;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FixedHeight.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("mp4Size");
        sb.append('=');
        sb.append(((this.mp4Size == null)?"<null>":this.mp4Size));
        sb.append(',');
        sb.append("mp4");
        sb.append('=');
        sb.append(((this.mp4 == null)?"<null>":this.mp4));
        sb.append(',');
        sb.append("webpSize");
        sb.append('=');
        sb.append(((this.webpSize == null)?"<null>":this.webpSize));
        sb.append(',');
        sb.append("webp");
        sb.append('=');
        sb.append(((this.webp == null)?"<null>":this.webp));
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
        result = ((result* 31)+((this.mp4 == null)? 0 :this.mp4 .hashCode()));
        result = ((result* 31)+((this.webpSize == null)? 0 :this.webpSize.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.mp4Size == null)? 0 :this.mp4Size.hashCode()));
        result = ((result* 31)+((this.webp == null)? 0 :this.webp.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixedHeight) == false) {
            return false;
        }
        FixedHeight rhs = ((FixedHeight) other);
        return (((((((((this.mp4 == rhs.mp4)||((this.mp4 != null)&&this.mp4 .equals(rhs.mp4)))&&((this.webpSize == rhs.webpSize)||((this.webpSize!= null)&&this.webpSize.equals(rhs.webpSize))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))))&&((this.mp4Size == rhs.mp4Size)||((this.mp4Size!= null)&&this.mp4Size.equals(rhs.mp4Size))))&&((this.webp == rhs.webp)||((this.webp!= null)&&this.webp.equals(rhs.webp))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
