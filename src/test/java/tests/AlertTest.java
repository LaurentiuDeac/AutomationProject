package tests;

import base.BaseTest;
import com.beust.ah.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertTest extends BaseTest {

    @Test
    public void registerTest(){


        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        String expectedPage="Register";
        String actualpage=Driver.getTitle();
        Assert.assertTrue("The expected page was notDisplayed",expectedPage.equals(actualpage));


        WebElement switchElement= Driver.findElement (By.xpath("//a[text()='SwitchTo']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();

        WebElement alertsElement= Driver.findElement(By.xpath("//a[text()='Alerts']"));
        alertsElement.click();
        Driver.navigate().to("http://demo.automationtesting.in/Alerts.html");


        List<WebElement> alertList=Driver.findElements(By.cssSelector(".analystic"));
        alertList.get(0).click();
        WebElement simpleAlertElement =Driver.findElement(By.cssSelector("button[onclick='alertbox()']"));
        simpleAlertElement.click();
        Alert simpleAlert=Driver.switchTo().alert();
        simpleAlert.accept();

        alertList.get(1).click();
        WebElement buttonAlertElement =Driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        buttonAlertElement.click();
        Alert buttonAlert=Driver.switchTo().alert();
        buttonAlert.dismiss();

        WebElement cancelMessageElements=Driver.findElement(By.id("demo"));
        String expectedMessage="You Pressed Cancel";
        String actualMessage=cancelMessageElements.getText();
        Assert.assertEquals(expectedMessage,actualMessage);


        alertList.get(2).click();
        WebElement promptElement =Driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        promptElement.click();
        Alert promptAlert=Driver.switchTo().alert();
        String alertValue="Laurentiu";
        promptAlert.sendKeys(alertValue);
        promptAlert.accept();

       WebElement textBoxElement=Driver.findElement(By.id("demo"));
       String expectedTextBox="Hello "+ alertValue +" How are you today";
       String actulaTextBox=textBoxElement.getText();
       Assert.assertEquals("The same message",expectedTextBox,actulaTextBox);

























    }
}
