package selenidelessons.tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;

import static selenidelessons.helpers.DriverHelper.configDriver;

public class BaseTest {

    @BeforeAll
    @Step("configure driver")
    public static void beforeAll() {
        configDriver();
    }
}
