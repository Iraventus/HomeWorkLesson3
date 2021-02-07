package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;

/**
 * Абстрактный класс, от которого будет наследоваться HomePage
 *
 * @param <T> Класс наследника. Необходим для корректной реализации паттерна Chain of invocations в сочетании с наследованием.
 */
public abstract class GitPageObject<T extends GitPageObject> implements IPageObject {
    public static final String MAIN_URL = "https://github.com";

    public T checkTextVisible(String text) {
        String textSelector = "//*[contains(text(),'%s')]";
        String selector = String.format(textSelector, text);
        $$x(selector).filterBy(Condition.visible).first().shouldBe(Condition.visible);
        return (T) this;
    }

    public T clickHref(String hrefName) {
       String hrefSelector = "//*[@href='%s']";
       String selector = String.format(hrefSelector, hrefName);
       $x(selector).click();
       return (T) this;
    }

    public T clickSpan(String hrefName) {
        String hrefSelector = "//span[@data-content='%s']";
        String selector = String.format(hrefSelector, hrefName);
        $x(selector).click();
        return (T) this;
    }
}
