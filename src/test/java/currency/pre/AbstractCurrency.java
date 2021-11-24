package currency.pre;

import alpha.currency.dao.DataFromProperties;

import java.io.IOException;

public abstract class AbstractCurrency extends DataFromProperties {
    private String appId;

    public AbstractCurrency() throws IOException {
        String appId = getProperty("data.appid");
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
