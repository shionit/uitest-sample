package com.shionit.uitest.sample;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by @shionit on 2018/05/05.
 */
public class GoogleSearchPage {

    /** 検索文字列 */
    @FindBy(name = "q")
    public SelenideElement q;

    /**
     * 検索を実行して結果ページを返す。
     * @return 検索結果ページオブジェクト
     */
    public GoogleResultPage search() {
        q.pressEnter();
        return page(GoogleResultPage.class);
    }
}
