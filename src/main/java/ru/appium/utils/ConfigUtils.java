package ru.appium.utils;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ConfigUtils {

    private static AndroidConfig androidConfig = ConfigFactory.create(AndroidConfig.class);
    private static DesiredCapabilities desiredCapabilities;
    private static final String PLATFORMNAME = "platformName";
    private static final String AUTOMATIONNAME = "automationName";
    private static final String PLATFORMVERSION = "platformVersion";
    private static final String DEVICENAME = "deviceName";

    private ConfigUtils() {
        throw new IllegalArgumentException("This is utils class");
    }

    private static void initCapabilities() {
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(PLATFORMNAME, androidConfig.platformName());
        desiredCapabilities.setCapability(AUTOMATIONNAME, androidConfig.automationName());
        desiredCapabilities.setCapability(PLATFORMVERSION, androidConfig.platformVersion());
        desiredCapabilities.setCapability(DEVICENAME, androidConfig.deviceName());
    }
    public static DesiredCapabilities getCapabilities() {
       if (desiredCapabilities == null) {
           initCapabilities();
       }
       return desiredCapabilities;
    }

    public static String getUrl() {
        return androidConfig.url();
    }

    public static Long getTimeWait() {
        return androidConfig.time();
    }

}
