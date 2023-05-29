package ru.appium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends AbstractBasePage{

    @FindBy(xpath = "//*[contains(@text, 'Система')]")
    private WebElement systemButton;

    @Step("Открываем системное меню")
    public void openSystemMenu() {
        systemButton.click();
    }
}
