package com.shionit.uitest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by @shionit on 2018/05/05.
 */
public class GoogleResultPage {

    @FindBy(css = "#ires")
    private SelenideElement results;

    @FindBy(css = "#ires div.g")
    private SelenideElement firstResultTitle;

    /**
     * @return 検索結果の要素コレクションを返す。
     */
    public ElementsCollection getResults() {
        return results.$$("div.g");
    }

    /**
     * @return 検索結果の要素1番目を返す。
     */
    public SelenideElement getFirst() {
        return firstResultTitle;
    }
}
