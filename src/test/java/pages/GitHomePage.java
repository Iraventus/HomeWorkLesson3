package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GitHomePage extends GitPageObject<GitHomePage> {

    public GitHomePage openURL() {
        open(MAIN_URL);
        return this;
    }

   public GitHomePage searchByValue(String value) {
        $(By.name("q")).val(value).pressEnter();
        return this;
   }
}