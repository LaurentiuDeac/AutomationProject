package tests;

import Objects.FrameObject;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import base.Hooks;
import org.junit.Test;

public class FrameTest extends Hooks {
    @Test
    public void registerTest() {
        FrameObject framedata = new FrameObject(testData);

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.goToFramePage();

        FramePage framePage = new FramePage(getDriver());
        framePage.singleFrameProccess(framedata);
        framePage.multipleFrameProccess(framedata);
    }



}
