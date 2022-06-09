package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class RegisterTest {
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


        WebElement firstNameElement=Driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
        String nameValue="laurentiu";
        firstNameElement.sendKeys(nameValue);

        WebElement lastNameElement=Driver.findElement(By.cssSelector("input[ng-model='LastName']"));
        String lastValue="deac";
        lastNameElement.sendKeys(lastValue);

        WebElement adressElement=Driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
        String adressValue="Floresti, Tautiului ";
        adressElement.sendKeys(adressValue);


        WebElement emailAddressElement=Driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
        String emailAddressValue="java@gmail.com";
        emailAddressElement.sendKeys(emailAddressValue);

        WebElement phoneElement=Driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
        String phoneValue="0034 567 578";
        phoneElement.sendKeys(phoneValue);


        WebElement genderElement=Driver.findElement(By.cssSelector("input[value='Male']"));
        genderElement.click();


        WebElement hobbiesElement=Driver.findElement(By.id("checkbox1"));
        hobbiesElement.click();


        WebElement skillsElement=Driver.findElement(By.id("Skills"));
        Select skillsDropDown=new Select(skillsElement);
        skillsDropDown.selectByVisibleText("APIs");


        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,250)", "");


        List<WebElement> languageOption= Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
        Integer index=0;
        while (index<languageOption.size()){
            if (languageOption.get(index).getText().equals("Arabic")){
                languageOption.get(index).click();
                break;


            }
            index++;

        }

        genderElement.click();






















    }
}
