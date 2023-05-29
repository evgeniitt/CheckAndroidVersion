package listeners;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.appium.utils.DriverManager;

public class AddScreenshotListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        attachScreen();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        attachScreen();
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = ".png")
    private byte[] attachScreen() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
