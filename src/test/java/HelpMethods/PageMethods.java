package HelpMethods;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageMethods {

    public WebDriver Driver;

    public PageMethods(WebDriver driver) {
        Driver = driver;
    }

    public void validateTitlePage(String value){
        String actualpage=Driver.getTitle();
        Assert.assertTrue("The expected page was not Displayed", value.equals(actualpage));
   }

    public void navigateToURL(String value){
        Driver.navigate().to(value);
   }

   public void scrollDownPage(Integer value){
        JavascriptExecutor js= (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,"+ value + ")","");
   }
   public void waitForSpecificge(String  page){
       WebDriverWait wait= new WebDriverWait(Driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.titleIs(page));
   }
   public void waitForUrl(String url){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(url));
   }
}
