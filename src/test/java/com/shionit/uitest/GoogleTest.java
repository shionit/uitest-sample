package com.shionit.uitest;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by @shionit on 2018/05/05.
 */
public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle() {
        open("https://www.google.com/");

        $(By.name("q")).setValue("selenide").pressEnter();

        $$("#ires div.g").shouldHave(size(10));
        $("#ires div.g", 2).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
