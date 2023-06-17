package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxWithPageObjectsTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    @Test
    void successfulFillFormTest() {

        textBoxPage.openPage()
                    .removeBanners()
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