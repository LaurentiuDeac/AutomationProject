package Pages;

import HelpMethods.ElementMethods;
import HelpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        pageMethods = new PageMethods(this.driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(id = "errormsg")
    private WebElement errorMessageElement;

    public void loginInvalidProcess(HashMap<String, String> values){
        pageMethods.validateTitlePage(values.get("loginPage"));
        elementMethods.fillElement(emailElement,values.get("email"));
        elementMethods.fillElement(passwordElement, values.get("password"));
        elementMethods.clickElement(enterElement);
        elementMethods.validateElementText(errorMessageElement, values.get("errorMessage"));
    }
}