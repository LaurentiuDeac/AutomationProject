package Pages;

import HelpMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;
    public TabMethods tabMethods;
    public FrameMethods frameMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(this.driver);
        this.pageMethods = new PageMethods(this.driver);
        this.alertMethods = new AlertMethods(this.driver);
        this.tabMethods = new TabMethods(this.driver);
        this.frameMethods=new FrameMethods(this.driver);

        PageFactory.initElements(driver, this);
    }
}
