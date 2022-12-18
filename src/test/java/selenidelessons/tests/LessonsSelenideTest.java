package selenidelessons.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LessonsSelenideTest extends BaseTest {

    @Test
    void verifyExampleSoftAssertion() {

        step("open selenide page on github", () ->
                open("/selenide/selenide")
        );

        step("go to Wiki tab", () -> $("#wiki-tab").click());

        step("go to Soft Assertion page", () -> {
            $(".js-wiki-more-pages-link").click();
            $("#wiki-pages-box").$(linkText("SoftAssertions")).click();
        });

        step("check example JUnit5", () ->
                $("#user-content-3-using-junit5-extend-test-class").parent()
                        .shouldBe(visible)
                        .shouldHave(text("Using JUnit5 extend test class"))
        );
    }
}
