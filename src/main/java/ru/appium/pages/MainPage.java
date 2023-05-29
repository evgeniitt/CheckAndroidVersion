package ru.appium.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;

import java.time.Duration;

import static ru.appium.utils.DriverManager.getDriver;

public class MainPage extends AbstractBasePage{

    @Step("Свайпаем вверх и открываем меню приложений")
    public void swipeUp() {
        new TouchAction(getDriver())
                .press(PointOption.point(getDriver().manage().window().getSize().getWidth()/2, getDriver().manage().window().getSize().getHeight()/2))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(getDriver().manage().window().getSize().getWidth()/2, 0))
                .release()
                .perform();

    }
}
