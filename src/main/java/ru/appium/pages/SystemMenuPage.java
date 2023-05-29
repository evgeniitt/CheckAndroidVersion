package ru.appium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemMenuPage extends AbstractBasePage{

    @FindBy (xpath = "//*[contains(@text, 'Обновление системы')]")
    private WebElement androidVersionButton;

    @Step("Открываем меню версии системы")
    public void openVersionMenu() {
        androidVersionButton.click();
    }
}
