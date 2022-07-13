package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
        pageMethods.waitForSpecificPage("Alerts");
    }

    @FindBy(css = ".analystic")
    private List<WebElement> alertOptions;
    @FindBy(css = "button[onclick='alertbox()']")
    private WebElement alertaOkButton;
    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement alertOkCancelButton;
    @FindBy(id = "demo")
    private WebElement alertOkCancelMessage;
    @FindBy(css = "button[class='btn btn-info']")
    private WebElement alertaTextButton;
    @FindBy(id = "demo1")
    private WebElement alertaTextMessage;



    public void dealAlertOk() {
        this.elementMethods.clickElement((WebElement)this.alertOptions.get(0));
        this.elementMethods.clickElement(this.alertaOkButton);
        this.alertMethods.acceptAlert();
    }

    public void dealAlertOkCancel(String value) {
        this.elementMethods.clickElement((WebElement)this.alertOptions.get(1));
        this.elementMethods.clickElement(this.alertOkCancelButton);
        this.alertMethods.cancelAlert();
        this.elementMethods.validateElementText(this.alertOkCancelMessage, value);
    }

    public void dealAlertInput(String value) {
        this.elementMethods.clickElement((WebElement)this.alertOptions.get(2));
        this.elementMethods.clickElement(this.alertaTextButton);
        this.alertMethods.fillAcceptAlert(value);
        String expectValue = "Hello " + value + " How are you today";
        this.elementMethods.validateElementText(this.alertaTextMessage, expectValue);
    }
}

