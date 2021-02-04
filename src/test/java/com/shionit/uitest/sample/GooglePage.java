package com.shionit.uitest.sample;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by @shionit on 2021/02/05.
 */
public class GooglePage {
    public void searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
    }
}
