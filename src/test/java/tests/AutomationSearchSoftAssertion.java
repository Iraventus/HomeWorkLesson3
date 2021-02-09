package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationSearchSoftAssertion {

    @Test
    public void testRun () {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $$(".internal").find(text("Soft assertions")).click();
        $$("#wiki-body li").shouldHave(itemWithText("Using JUnit5 extend test class:"));
    }
}
