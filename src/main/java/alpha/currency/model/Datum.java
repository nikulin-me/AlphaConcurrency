
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("analytics")
    @Expose
    private Analytics analytics;

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

    public Analytics getAnalytics() {
        return analytics;
    }

    public void setAnalytics(Analytics analytics) {
        this.analytics = analytics;
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
        sb.append(((this.analytics == null)?"<null>":this.analytics));
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
        result = ((result* 31)+((this.analytics == null)? 0 :this.analytics.hashCode()));
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
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return ((((((((((((((((((((((this.embedUrl == rhs.embedUrl)||((this.embedUrl!= null)&&this.embedUrl.equals(rhs.embedUrl)))&&((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images))))&&((this.sourcePostUrl == rhs.sourcePostUrl)||((this.sourcePostUrl!= null)&&this.sourcePostUrl.equals(rhs.sourcePostUrl))))&&((this.bitlyUrl == rhs.bitlyUrl)||((this.bitlyUrl!= null)&&this.bitlyUrl.equals(rhs.bitlyUrl))))&&((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating))))&&((this.trendingDatetime == rhs.trendingDatetime)||((this.trendingDatetime!= null)&&this.trendingDatetime.equals(rhs.trendingDatetime))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.analytics == rhs.analytics)||((this.analytics!= null)&&this.analytics.equals(rhs.analytics))))&&((this.contentUrl == rhs.contentUrl)||((this.contentUrl!= null)&&this.contentUrl.equals(rhs.contentUrl))))&&((this.sourceTld == rhs.sourceTld)||((this.sourceTld!= null)&&this.sourceTld.equals(rhs.sourceTld))))&&((this.isSticker == rhs.isSticker)||((this.isSticker!= null)&&this.isSticker.equals(rhs.isSticker))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.bitlyGifUrl == rhs.bitlyGifUrl)||((this.bitlyGifUrl!= null)&&this.bitlyGifUrl.equals(rhs.bitlyGifUrl))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.importDatetime == rhs.importDatetime)||((this.importDatetime!= null)&&this.importDatetime.equals(rhs.importDatetime))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.analyticsResponsePayload == rhs.analyticsResponsePayload)||((this.analyticsResponsePayload!= null)&&this.analyticsResponsePayload.equals(rhs.analyticsResponsePayload))));
    }

}
