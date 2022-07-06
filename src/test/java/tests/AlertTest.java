package tests;

import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import base.BaseTest;
import base.Hooks;
import org.junit.Test;

public class AlertTest extends Hooks {

    @Test
    public void registerTest() {
        IndexPage indexPage = new IndexPage(this.getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(this.getDriver());
        registerPage.goToAlertPage();
        AlertPage alertPage = new AlertPage(this.getDriver());
        alertPage.dealAlertOk();
        String expectedMess = "You Pressed Cancel";
        alertPage.dealAlertOkCancel(expectedMess);
        alertPage.dealAlertInput("Laurentiu");
    }
}

//    @Test
//    public void registerTest(){
//
//        IndexPage indexPage=new IndexPage(Driver);
//        indexPage.clickSkipSignIn();
//
//        RegisterPage registerPage=new RegisterPage(Driver);
//        registerPage.
//
//
//
//
//        ElementMethods elementMethods = new ElementMethods(Driver);
//        AlertMethods alertMethods= new AlertMethods(Driver);
//        PageMethods pageMethods=new PageMethods(Driver);
//
//
//        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
//        skipSignInElement.click();
//
//        String expectedPage="Register";
//        pageMethods.validateTitlePage(expectedPage);
////        String actualpage=Driver.getTitle();
////        Assert.assertTrue("The expected page was notDisplayed",expectedPage.equals(actualpage));
//
//
//        WebElement switchElement= Driver.findElement (By.xpath("//a[text()='SwitchTo']"));
//        elementMethods.hoverElement(switchElement);
//
//        WebElement alertsElement= Driver.findElement(By.xpath("//a[text()='Alerts']"));
//        alertsElement.click();
//        pageMethods.navigateToURL("http://demo.automationtesting.in/Alerts.html");
////        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
//
//
//        List<WebElement> alertList=Driver.findElements(By.cssSelector(".analystic"));
//        alertList.get(0).click();
//        WebElement simpleAlertElement =Driver.findElement(By.cssSelector("button[onclick='alertbox()']"));
//        simpleAlertElement.click();
//        Alert simpleAlert=Driver.switchTo().alert();
//        simpleAlert.accept();
//
//        alertList.get(1).click();
//        WebElement buttonAlertElement =Driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//        buttonAlertElement.click();
//        Alert buttonAlert=Driver.switchTo().alert();
//        buttonAlert.dismiss();
//
//        WebElement messageValidElement =Driver.findElement(By.id("demo"));
//        String expectedMess="You Pressed Cancel";
//        elementMethods.validateElementText(messageValidElement,expectedMess);
//
////        WebElement cancelMessageElements=Driver.findElement(By.id("demo"));
////        String expectedMessage="You Pressed Cancel";
////        String actualMessage=cancelMessageElements.getText();
////        Assert.assertEquals(expectedMessage,actualMessage);
//
//
//        alertList.get(2).click();
//        WebElement promptElement =Driver.findElement(By.xpath("//button[@class='btn btn-info']"));
//        promptElement.click();
//        Alert promptAlert=Driver.switchTo().alert();
//        String alertValue="Laurentiu";
//        promptAlert.sendKeys(alertValue);
//        promptAlert.accept();
//
//
//
//       WebElement textBoxElement=Driver.findElement(By.id("demo1"));
//       String expectedTextBox="Hello "+ alertValue +" How are you today";
//       elementMethods.validateElementText(textBoxElement, expectedTextBox);
//
////       String actulaTextBox=textBoxElement.getText();
//////     Assert.assertEquals("The same message",expectedTextBox,actulaTextBox);
//
//
//    }
//}
