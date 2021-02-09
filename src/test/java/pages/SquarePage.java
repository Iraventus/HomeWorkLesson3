package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
/**
 * Метод switchSquare не сработал. Скидываю одну из попыток реализации.
 */
public class SquarePage {
     String Base_URL = "https://the-internet.herokuapp.com/drag_and_drop";

    public SquarePage openURL() {
        open(Base_URL);
        return this;
    }

    public SquarePage switchSquare() {
        int x = $(By.id("column-b")).getLocation().getX();
        int y = $(By.id("column-b")).getLocation().getY();
        actions().dragAndDropBy($("#column-a"), x, y).perform();
        return this;
    }

    public SquarePage checkSquare() {
        $$(".column").first().shouldHave(text("A"));
        return this;
    }
}



