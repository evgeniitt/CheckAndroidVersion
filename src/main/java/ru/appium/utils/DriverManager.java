package ru.appium.utils;

import io.appium.java_client.android.AndroidDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static ru.appium.utils.ConfigUtils.*;

public class DriverManager {

    private static final Logger LOG = LoggerFactory.getLogger(DriverManager.class);
    private static ThreadLocal<AndroidDriver> webDriverThreadLocal = new ThreadLocal<>();

    private DriverManager() {
        throw new IllegalArgumentException("This is utils class");
    }

    private static void initDriver() throws MalformedURLException {
        AndroidDriver androidDriver = new AndroidDriver(new URL(getUrl()), getCapabilities());
        androidDriver.manage().timeouts().implicitlyWait(getTimeWait(), TimeUnit.SECONDS);
        webDriverThreadLocal.set(androidDriver);
    }

    public static AndroidDriver getDriver() {
        if (webDriverThreadLocal.get() == null) {
            try {
                initDriver();
            } catch (MalformedURLException e) {
                LOG.error("Couldn't to init android driver {}", e.toString());
            }
        }
        return  webDriverThreadLocal.get();
    }

}
