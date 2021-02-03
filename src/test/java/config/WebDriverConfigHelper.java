package config;

import org.aeonbits.owner.ConfigFactory;

public class WebDriverConfigHelper {

    private static WebDriverConfig getConfig() {
        if (System.getProperty("environment") == null) System.setProperty("environment", "localWeb"); // test, preprod

        return ConfigFactory.newInstance().create(WebDriverConfig.class, System.getProperties());
    }

    public static String getWebUrl() {
        return getConfig().webUrl();
    }

    public static String getBrowserVersion() {
        return getConfig().browserVersion();
    }

    public static String getBrowserName() {
        return getConfig().browserName();
    }
}
