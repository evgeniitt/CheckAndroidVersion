package ru.appium;

import io.qameta.allure.*;
import listeners.AddScreenshotListener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.appium.pages.*;


@Listeners(AddScreenshotListener.class)
@Epic(value = "Тестируем ввод данных")
public class CheckAndroidVersionTest {
    @Link(name = "Android Version")
    @Owner(value = "Evgenii Tatarkin")
    @Description("Открываем меню с приложениями, переходим в настройки, переходим в раздел с версией системы, проверяем версию системы")
    @Feature(value = "Проверяем версию системы")
    @Story(value = "Переходим в раздел с настройками и проверяем версию системы")

    @Test(description = "Проверяем версию системы")
    public void checkAndroidVersionTest() {
        new MainPage().swipeUp();
        new AppPage().pressMenuButton();
        new SettingsPage().openSystemMenu();
        new SystemMenuPage().openVersionMenu();
        new AndroidVersionPage().checkVersion("Android: 13");
    }

}
