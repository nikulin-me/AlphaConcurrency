
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("bitly_gif_url")
    @Expose
    private String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    private String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_tld")
    @Expose
    private String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("is_sticker")
    @Expose
    private Integer isSticker;
    @SerializedName("import_datetime")
    @Expose
    private String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    private String trendingDatetime;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("analytics_response_payload")
    @Expose
    private String analyticsResponsePayload;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    public String getBitlyUrl() {
        return bitlyUrl;
    }

    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getSourceTld() {
        return sourceTld;
    }

    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
    }

    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }

    public Integer getIsSticker() {
        return isSticker;
    }

    public void setIsSticker(Integer isSticker) {
        this.isSticker = isSticker;
    }

    public String getImportDatetime() {
        return importDatetime;
    }

    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAnalyticsResponsePayload() {
        return analyticsResponsePayload;
    }

    public void setAnalyticsResponsePayload(String analyticsResponsePayload) {
        this.analyticsResponsePayload = analyticsResponsePayload;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("bitlyGifUrl");
        sb.append('=');
        sb.append(((this.bitlyGifUrl == null)?"<null>":this.bitlyGifUrl));
        sb.append(',');
        sb.append("bitlyUrl");
        sb.append('=');
        sb.append(((this.bitlyUrl == null)?"<null>":this.bitlyUrl));
        sb.append(',');
        sb.append("embedUrl");
        sb.append('=');
        sb.append(((this.embedUrl == null)?"<null>":this.embedUrl));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
        sb.append(',');
        sb.append("contentUrl");
        sb.append('=');
        sb.append(((this.contentUrl == null)?"<null>":this.contentUrl));
        sb.append(',');
        sb.append("sourceTld");
        sb.append('=');
        sb.append(((this.sourceTld == null)?"<null>":this.sourceTld));
        sb.append(',');
        sb.append("sourcePostUrl");
        sb.append('=');
        sb.append(((this.sourcePostUrl == null)?"<null>":this.sourcePostUrl));
        sb.append(',');
        sb.append("isSticker");
        sb.append('=');
        sb.append(((this.isSticker == null)?"<null>":this.isSticker));
        sb.append(',');
        sb.append("importDatetime");
        sb.append('=');
        sb.append(((this.importDatetime == null)?"<null>":this.importDatetime));
        sb.append(',');
        sb.append("trendingDatetime");
        sb.append('=');
        sb.append(((this.trendingDatetime == null)?"<null>":this.trendingDatetime));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("analyticsResponsePayload");
        sb.append('=');
        sb.append(((this.analyticsResponsePayload == null)?"<null>":this.analyticsResponsePayload));
        sb.append(',');
        sb.append("analytics");
        sb.append('=');
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
        result = ((result* 31)+((this.embedUrl == null)? 0 :this.embedUrl.hashCode()));
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.sourcePostUrl == null)? 0 :this.sourcePostUrl.hashCode()));
        result = ((result* 31)+((this.bitlyUrl == null)? 0 :this.bitlyUrl.hashCode()));
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.trendingDatetime == null)? 0 :this.trendingDatetime.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.contentUrl == null)? 0 :this.contentUrl.hashCode()));
        result = ((result* 31)+((this.sourceTld == null)? 0 :this.sourceTld.hashCode()));
        result = ((result* 31)+((this.isSticker == null)? 0 :this.isSticker.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.bitlyGifUrl == null)? 0 :this.bitlyGifUrl.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.importDatetime == null)? 0 :this.importDatetime.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.analyticsResponsePayload == null)? 0 :this.analyticsResponsePayload.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datum datum = (Datum) o;
        return Objects.equals(type, datum.type) && Objects.equals(id, datum.id) && Objects.equals(url, datum.url) && Objects.equals(slug, datum.slug) && Objects.equals(bitlyGifUrl, datum.bitlyGifUrl) && Objects.equals(bitlyUrl, datum.bitlyUrl) && Objects.equals(embedUrl, datum.embedUrl) && Objects.equals(username, datum.username) && Objects.equals(source, datum.source) && Objects.equals(title, datum.title) && Objects.equals(rating, datum.rating) && Objects.equals(contentUrl, datum.contentUrl) && Objects.equals(sourceTld, datum.sourceTld) && Objects.equals(sourcePostUrl, datum.sourcePostUrl) && Objects.equals(isSticker, datum.isSticker) && Objects.equals(importDatetime, datum.importDatetime) && Objects.equals(trendingDatetime, datum.trendingDatetime) && Objects.equals(images, datum.images) && Objects.equals(user, datum.user) && Objects.equals(analyticsResponsePayload, datum.analyticsResponsePayload);
    }
}
