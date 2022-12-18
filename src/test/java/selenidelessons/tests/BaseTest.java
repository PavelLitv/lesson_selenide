package selenidelessons.tests;

import org.junit.jupiter.api.BeforeAll;

import static selenidelessons.helpers.DriverHelper.configDriver;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        configDriver();
    }
}
