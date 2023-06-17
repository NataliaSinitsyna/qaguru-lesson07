package com.demoqa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxWithPageObjectsTests extends TestBase {

    @Test
    void successfulFillFormTest() {

        textBoxPage.openPage()
                        .setUserName("Mr Smith")
                        .setUserEmail("aa@aaa.com")
                        .setCurrentAddress("Some street 1")
                        .setPermanentAddress("Another street 1")
                        .submit();
        textBoxPage.verifyData("name", "Mr Smith")
                    .verifyData("email", "aa@aaa.com")
                    .verifyData("currentAddress", "Some street 1")
                    .verifyData("permanentAddress", "Another street 1");

    }
}