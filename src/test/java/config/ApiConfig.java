package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:~/token.properties",
        "system:properties",
})
public interface ApiConfig extends Config {

    @Key("api.url")
    String url();

    @Key("api.token")
    String token();
}
