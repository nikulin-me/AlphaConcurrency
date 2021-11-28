
package alpha.currency.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class User {

    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("banner_image")
    @Expose
    private String bannerImage;
    @SerializedName("banner_url")
    @Expose
    private String bannerUrl;
    @SerializedName("profile_url")
    @Expose
    private String profileUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("instagram_url")
    @Expose
    private String instagramUrl;
    @SerializedName("website_url")
    @Expose
    private String websiteUrl;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("bannerImage");
        sb.append('=');
        sb.append(((this.bannerImage == null)?"<null>":this.bannerImage));
        sb.append(',');
        sb.append("bannerUrl");
        sb.append('=');
        sb.append(((this.bannerUrl == null)?"<null>":this.bannerUrl));
        sb.append(',');
        sb.append("profileUrl");
        sb.append('=');
        sb.append(((this.profileUrl == null)?"<null>":this.profileUrl));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("instagramUrl");
        sb.append('=');
        sb.append(((this.instagramUrl == null)?"<null>":this.instagramUrl));
        sb.append(',');
        sb.append("websiteUrl");
        sb.append('=');
        sb.append(((this.websiteUrl == null)?"<null>":this.websiteUrl));
        sb.append(',');
        sb.append("isVerified");
        sb.append('=');
        sb.append(((this.isVerified == null)?"<null>":this.isVerified));
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
        result = ((result* 31)+((this.profileUrl == null)? 0 :this.profileUrl.hashCode()));
        result = ((result* 31)+((this.bannerImage == null)? 0 :this.bannerImage.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.websiteUrl == null)? 0 :this.websiteUrl.hashCode()));
        result = ((result* 31)+((this.isVerified == null)? 0 :this.isVerified.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.bannerUrl == null)? 0 :this.bannerUrl.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.instagramUrl == null)? 0 :this.instagramUrl.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return (((((((((((this.profileUrl == rhs.profileUrl)||((this.profileUrl!= null)&&this.profileUrl.equals(rhs.profileUrl)))&&((this.bannerImage == rhs.bannerImage)||((this.bannerImage!= null)&&this.bannerImage.equals(rhs.bannerImage))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.websiteUrl == rhs.websiteUrl)||((this.websiteUrl!= null)&&this.websiteUrl.equals(rhs.websiteUrl))))&&((this.isVerified == rhs.isVerified)||((this.isVerified!= null)&&this.isVerified.equals(rhs.isVerified))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.bannerUrl == rhs.bannerUrl)||((this.bannerUrl!= null)&&this.bannerUrl.equals(rhs.bannerUrl))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.instagramUrl == rhs.instagramUrl)||((this.instagramUrl!= null)&&this.instagramUrl.equals(rhs.instagramUrl))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
