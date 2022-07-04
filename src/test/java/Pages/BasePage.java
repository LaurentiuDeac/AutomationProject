package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import HelpMethods.TabMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;
    public TabMethods tabMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(this.driver);
        this.pageMethods = new PageMethods(this.driver);
        this.alertMethods = new AlertMethods(this.driver);
        this.tabMethods = new TabMethods(this.driver);
        PageFactory.initElements(driver, this);
    }
}
