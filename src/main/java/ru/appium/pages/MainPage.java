package ru.appium.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import ru.appium.utils.DriverManager;

import java.time.Duration;

public class MainPage extends AbstractBasePage{
    @Step("Свайпаем вверх и открываем меню приложений")
    public void swipeUp() {
        AndroidDriver androidDriver = DriverManager.getDriver();
        new TouchAction(androidDriver)
                .press(PointOption.point(500, 2000))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(500, 100))
                .release()
                .perform();
    }
}
