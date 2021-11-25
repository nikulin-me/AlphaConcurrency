package alpha.currency.model;

import com.google.gson.annotations.SerializedName;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Gif {
    private String url;

    private List<Map<String,String>> data;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Gif(String url, List<Map<String, String>> data) {
        this.url = url;
        this.data = data;
    }

    public Gif() {
    }

    public List<Map<String, String>> getData() {
        return data;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Gif{" +
                "url='" + url + '\'' +
                ", data=" + data +
                '}';
    }
}
