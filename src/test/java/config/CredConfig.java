package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credential.properties")
public interface CredConfig extends Config {
    @Key("login")
    String login();

    @Key("password")
    String password();

    @Key("app")
    String app();
}
