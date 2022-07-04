package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.List;

public class Widgets {

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

        WebElement switchElement= Driver.findElement (By.xpath("//a[text()='Widgets']"));
        Actions action = new Actions(Driver);
        action.moveToElement(switchElement).build().perform();


        List<WebElement> refList = Driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a "));
        for (WebElement element:refList){
            //System.out.println(element.getAttribute("href"));
            if (element.getAttribute("href").contains("Slider")){
                element.click();
                Driver.navigate().to("http://demo.automationtesting.in/Slider.html");
                break;
            }
        }


        //WebElement slideElement= Driver.findElement(By.xpath("//div[@class='ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']"));
       // slideElement.click();

       WebElement slider= Driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
       Actions move=new Actions(Driver);
       Action action1=(Action)move.dragAndDropBy(slider,90,0).build();
       action1.perform();




    }

}


