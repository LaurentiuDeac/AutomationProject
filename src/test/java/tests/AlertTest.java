package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest {
    public WebDriver Driver;

    @Test
    public void registerTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("http://demo.automationtesting.in/Index.html");
        Driver.manage().window().maximize();

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












    }
}
