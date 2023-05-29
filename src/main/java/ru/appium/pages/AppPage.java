package ru.appium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppPage extends AbstractBasePage{

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Настройки\"]")
    private WebElement menuButton;

    @Step("Нажимаем на кнопку открытия меню настроек")
    public void pressMenuButton() {
        menuButton.click();
    }
}
