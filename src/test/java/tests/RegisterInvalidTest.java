package tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import base.BaseTest;
import base.Hooks;
import org.junit.Test;

public class RegisterInvalidTest extends Hooks {

    @Test
    public void registerTest() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerInvalidMandatoryFields("address 1",
                "English", "Australia",
                "Java", "1990", "October", "12", "Proba123@",
                "Proba123@");

    }
}

