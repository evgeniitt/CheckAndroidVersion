package ru.appium.pages;

import static org.openqa.selenium.support.PageFactory.initElements;
import static ru.appium.utils.DriverManager.getDriver;

public abstract class AbstractBasePage {

    public AbstractBasePage() {
        initElements(getDriver(), this);
    }

}
