package config;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigHelper {

    private static ApiConfig getConfig() {
        return ConfigFactory.newInstance().create(ApiConfig.class, System.getProperties());
    }

    public static String getUrl() {
        return getConfig().url();
    }

    public static String getToken() {
        return getConfig().token();
    }
}
