package ru.appium.utils;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:android.properties"})
public interface AndroidConfig extends Config {
    String url();

    String platformName();

    String platformVersion();

    String deviceName();

    String automationName();

    Long time();

}
