package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${environment}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("browser.web.url")
    String webUrl();

}
