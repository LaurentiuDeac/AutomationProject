package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.TabMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage {
    @FindBy(css = ".analystic")
    private List<WebElement> windowsButtons;
    @FindBy(css = "#Tabbed>a>button")
    private WebElement clickTabElement;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement clickWindowElement;
    @FindBy(css = "#Multiple>button")
    private WebElement clickTabsElement;

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    public void dealWithTab(Integer tab) {
        this.elementMethods.clickElement((WebElement)this.windowsButtons.get(0));
        this.elementMethods.clickElement(this.clickTabElement);
        this.tabMethods.switchSpecificTabWindow(tab);
        this.tabMethods.closeCurrentTabWindow();
        this.tabMethods.switchSpecificTabWindow(tab - 1);
    }

    public void dealWithWindow(Integer window) {
        this.elementMethods.clickElement((WebElement)this.windowsButtons.get(1));
        this.elementMethods.clickElement(this.clickWindowElement);
        this.tabMethods.switchSpecificTabWindow(window);
        this.tabMethods.closeCurrentTabWindow();
        this.tabMethods.switchSpecificTabWindow(window - 1);
    }

    public void dealWithMultipleTab(Integer tabs) {
        this.elementMethods.clickElement((WebElement)this.windowsButtons.get(2));
        this.elementMethods.clickElement(this.clickTabsElement);
        this.tabMethods.switchSpecificTabWindow(tabs);
        this.tabMethods.closeCurrentTabWindow();
        this.tabMethods.switchSpecificTabWindow(tabs - 1);
        this.tabMethods.closeCurrentTabWindow();
        this.tabMethods.switchSpecificTabWindow(tabs - 2);
    }
}

