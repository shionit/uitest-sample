package com.shionit.uitest;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by @shionit on 2018/05/05.
 */
public class GoogleSearchPage {

    @FindBy(name = "q")
    private SelenideElement q;

    /**
     * 検索文字列を設定する。
     * @param query 検索文字列
     */
    public void setQ(String query) {
        q.setValue(query);
    }

    /**
     * 検索を実行して結果ページを返す。
     * @return 検索結果ページオブジェクト
     */
    public GoogleResultPage search() {
        q.pressEnter();
        return page(GoogleResultPage.class);
    }
}
