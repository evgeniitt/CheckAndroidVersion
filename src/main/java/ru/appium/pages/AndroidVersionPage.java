package ru.appium.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AndroidVersionPage extends AbstractBasePage{

    @FindBy (xpath = "//*[contains(@text, 'Версия Android')]")
    private WebElement androidVersionFrame;

    @Step("Сверяем текущую версию с актуальной")
    public void checkVersion(String version) {
        String currentVersion = androidVersionFrame.getText();
        if(
                currentVersion.contains(version)
        ) System.out.println("Version is actual");
        else System.out.println("Version is need to update");
    }
}
