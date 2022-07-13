package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {

    public WebDriver Driver;

    public FrameMethods(WebDriver driver) {
        Driver = driver;
    }

    public void switchFramebyValue(String value){
        Driver.switchTo().frame(value);
    }

    public void switchFramebyElement(WebElement element){
        Driver.switchTo().frame(element);

    }

    public void switchToDefaultFrame(){
        Driver.switchTo().defaultContent();

    }


}



