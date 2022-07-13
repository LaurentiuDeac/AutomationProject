package Pages;

import HelpMethods.ElementMethods;
import Pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver){
        super(driver);

    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchToElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertSubMeniu;
    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowSubmeniu;
    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;
    @FindBy(xpath = "//textarea[@ng-model='Adress']")
    private WebElement addressElement;
    @FindBy(css = "input[ng-model='EmailAdress']")
    private WebElement emailAddress;
    @FindBy(css = "input[ng-model='Phone']")
    private WebElement phoneElement;
    @FindBy(css = "input[value='FeMale']")
    private WebElement genderElement;
    @FindBy(id = "checkbox1")
    private WebElement hobbieElement;
    @FindBy(id = "msdd")
    private WebElement languageElement;
    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a")
    private List<WebElement> selectLanguageElement;
    @FindBy(id = "Skills")
    private WebElement skillsElement;
    @FindBy(xpath = "//span[@role='combobox']")
    private WebElement clickCountryElement;
    @FindBy(css = "span[class='select2-selection select2-selection--single']")
    private WebElement selectCountryElement;
    @FindBy(css = "input[class='select2-search__field']")
    private WebElement inputCountryElement;
    @FindBy(id = "yearbox")
    private WebElement yearElement;
    @FindBy(css = "select[ng-model='monthbox']")
    private WebElement monthElement;
    @FindBy(id = "daybox")
    private WebElement dayElement;
    @FindBy(id = "firstpassword")
    private WebElement passwordElement;
    @FindBy(id="secondpassword")
    private WebElement confirmPasswElement;
    @FindBy(id="imagesrc")
    private WebElement imageElement;
    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement framesSubmeniu;


    public void goToAlertPage(){
        elementMethods.hoverElement(switchToElement);
        elementMethods.clickElement(alertSubMeniu);
        pageMethods.navigateToURL("http://demo.automationtesting.in/Alerts.html");
    }

    public void goToFramePage(){
        elementMethods.hoverElement(switchToElement);
        elementMethods.clickElement(framesSubmeniu);
        pageMethods.navigateToURL("http://demo.automationtesting.in/Frames.html");
    }

    public void goToWindowPage(){
        elementMethods.hoverElement(switchToElement);
        elementMethods.clickElement(windowSubmeniu);
        pageMethods.navigateToURL("http://demo.automationtesting.in/Windows.html");
    }



    public void registerValid (String firstName, String lastName, String address,
                              String phone, String email, String language,
                              String country, String skills, String year,
                              String month, String day, String password,
                              String confirmPassword, String file){
        fillFirstName(firstName);
        fillLastName(lastName);
        fillAddress(address);
        fillPhone(phone);
        fillEmail(email);
        clickGender();
        selectHobbie();
        languageElement(language);
        clickGender();
        selectCountry(country);
        skillsDropDown(skills);
        yearDropDown(year);
        monthDropDown(month);
        dayDropDown(day);
        fillPassword(password);
        fillConfirmPassword(confirmPassword);
        importFile(file);
    }

    public void registerInvalidMandatoryFields( String address, String language,
                                                String country, String skills, String year,
                                                String month, String day, String password,
                                                String confirmPassword){
        fillAddress(address);
        selectHobbie();
        languageElement(language);
        clickAddress();
        clickGender();
        selectCountry(country);
        skillsDropDown(skills);
        yearDropDown(year);
        monthDropDown(month);
        dayDropDown(day);
        fillPassword(password);
        fillConfirmPassword(confirmPassword);
    }

    public void fillFirstName(String value){
        elementMethods.fillElement(firstName,value);
    }
    public void fillLastName(String value){
        elementMethods.fillElement(lastName,value);
    }

    public void fillAddress(String value){
        elementMethods.fillElement(addressElement,value);
    }

    public void clickAddress(){
        elementMethods.clickElement(addressElement);
    }

    public void fillPhone(String value){
        elementMethods.fillElement(phoneElement,value);
    }

    public void clickGender(){
        elementMethods.clickElement(genderElement);
    }

    public void selectHobbie(){
        elementMethods.clickElement(hobbieElement);
    }

    public void languageElement(String value){
        elementMethods.clickElement(languageElement);
        Integer index = 0;
        while (index < selectLanguageElement.size()) {
            if (selectLanguageElement.get(index).getText().equals(value)) {
                selectLanguageElement.get(index).click();
                break;
            }
            index++;
        }
    }

    public void selectCountry(String value){
        elementMethods.clickElement(clickCountryElement);
        selectCountryElement.sendKeys(value);
        selectCountryElement.sendKeys(Keys.ENTER);
    }

    public void skillsDropDown(String value){
        elementMethods.selectTextElement(skillsElement,value);
    }

    public void yearDropDown(String value){
        elementMethods.selectValueElement(yearElement,value);
    }

    public void monthDropDown(String value){
        elementMethods.selectValueElement(monthElement,value);
    }

    public void dayDropDown(String value){
        elementMethods.selectValueElement(dayElement,value);
    }

    public void fillPassword(String value){
        elementMethods.fillElement(passwordElement, value);
    }

    public void fillConfirmPassword(String value){
        elementMethods.fillElement(confirmPasswElement, value);
    }

    public void importFile(String value){
        imageElement.sendKeys(value);
    }

    public void fillEmail(String value){
        elementMethods.fillElement(emailAddress,value);

    }
}