package selenidelessons.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;

public class DriverHelper {

    @Step("configure driver")
    public static void configDriver() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.holdBrowserOpen = true;
    }
}
