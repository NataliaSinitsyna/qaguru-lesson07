package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";

    }
}