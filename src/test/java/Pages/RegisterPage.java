package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement swithToElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertSubMeniu;
    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowSubmeniu;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void goToAlertPage() {
        this.elementMethods.hoverElement(this.swithToElement);
        this.elementMethods.clickElement(this.alertSubMeniu);
        this.pageMethods.navigateToURL("http://demo.automationtesting.in/Alerts.html");
    }

    public void goToWindowPage() {
        this.elementMethods.hoverElement(this.swithToElement);
        this.elementMethods.clickElement(this.windowSubmeniu);
        this.pageMethods.navigateToURL("http://demo.automationtesting.in/Windows.html");
    }
}
