package pagesPart2;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
/**
 * Метод switchSquare не сработал. Скидываю одну из попыток реализации.
 */
public class SquarePage {
    public static final String MAIN_URL_2 = "https://the-internet.herokuapp.com/drag_and_drop";

    public SquarePage openURL() {
        open(MAIN_URL_2);
        return this;
    }

    public SquarePage switchSquare() {
        int x = $(By.id("column-b")).getLocation().getX();
        int y = $(By.id("column-b")).getLocation().getY();
        actions().dragAndDropBy($(By.id("column-a")), x, y).perform();
        return this;
    }

    public SquarePage checkSquare() {
        $$(By.className("column")).first().shouldBe(Condition.id("column-b"));
        return this;
    }
}


