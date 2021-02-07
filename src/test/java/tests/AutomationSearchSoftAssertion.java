package tests;

import org.junit.jupiter.api.Test;
import pages.GitHomePage;


public class AutomationSearchSoftAssertion {
    private GitHomePage gitHomePage = new GitHomePage();
    private final String href1 = "/selenide/selenide";
    private final String href2 = "/selenide/selenide/wiki/SoftAssertions";

    @Test
    public void testRun () {
        gitHomePage.openURL()
                .checkTextVisible("Sign up for GitHub")
                .searchByValue("selenide")
                .checkTextVisible("repository results")
                .clickHref(href1)
                .checkTextVisible("Contributors")
                .clickSpan("Wiki")
                .checkTextVisible("SoftAssertions")
                .clickHref(href2)
                .checkTextVisible("Using JUnit5 extend test class")
                .checkTextVisible("@ExtendWith");
    }
}
