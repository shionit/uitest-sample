package com.shionit.uitest;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by @shionit on 2018/05/05.
 */
public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle() {
        GoogleSearchPage searchPage = open("https://www.google.com/", GoogleSearchPage.class);

        searchPage.setQ("selenide");

        GoogleResultPage resultPage = searchPage.search();

        resultPage.getResults().shouldHaveSize(10);
        resultPage.getFirst().shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
