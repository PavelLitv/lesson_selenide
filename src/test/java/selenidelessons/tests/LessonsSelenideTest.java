package selenidelessons.tests;

import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LessonsSelenideTest extends BaseTest {

    @Test
    @Story("lessons 11 part 1")
    @Tag("task_2")
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

    @Test
    @Story("lessons 11 part 2")
    @Tag("task_1")
    void openEnterprisePagesUsingHover() {

        step("open github main page", () -> open(""));

        step("click header menu Solutions -> Enterprise", () -> {
            $$(".header-menu-wrapper button").findBy(text("Solutions")).hover();
            $(linkText("Enterprise")).click();
        });

        step("verify header contains Build like the best", () ->
                $("h1").shouldHave(text("Build like the best"))
        );
    }

    @Test
    @Story("lessons 11 part 2")
    @Tag("task_2")
    void dragAndDropUsingSelenide() {

        step("open page with drag and drop example", () ->
                open("https://the-internet.herokuapp.com/drag_and_drop"));

        step("drag and drop A to B", () ->
                $("#column-a").dragAndDropTo($("#column-b")));

        step("verify result drag and drop", () ->
                $$(".column").first().shouldHave(text("B"))
        );
    }
}
