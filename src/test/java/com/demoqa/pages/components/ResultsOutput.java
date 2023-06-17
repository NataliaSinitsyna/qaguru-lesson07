package com.demoqa.pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultsOutput {

    public void verifyOutputData(String key, String value) {
        $(String.format("#output #%s", key)).shouldHave(text(value));
    }

}
