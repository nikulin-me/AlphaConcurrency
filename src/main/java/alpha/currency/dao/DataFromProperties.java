package alpha.currency.dao;

import java.io.IOException;
import java.util.Properties;


public class DataFromProperties {
    private static Properties properties;

    protected static String getProperty(String propertyKey) throws IOException {

        if (properties == null) {
            DataFromProperties.init();
        }

        return properties.getProperty(propertyKey);
    }

    protected static void init() throws IOException {
        properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("application.yml"));
    }

}
