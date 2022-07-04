package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabMethods {
    public WebDriver Driver;

    public TabMethods(WebDriver driver) {
        this.Driver = driver;
    }

    public void switchSpecificTabWindow(Integer index) {
        List<String> windowList = new ArrayList(this.Driver.getWindowHandles());
        this.Driver.switchTo().window((String)windowList.get(index));
        System.out.println(this.Driver.getTitle());
    }

    public void closeCurrentTabWindow() {
        this.Driver.close();
    }

    public void closeCurrentTabWindo() {this.Driver.close();}
}
