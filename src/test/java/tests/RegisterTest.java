package tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import base.BaseTest;
import base.Hooks;
import org.junit.Test;

public class RegisterTest extends Hooks {
    @Test
    public void registerTest() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.registerValid("FirstNameTest","LastNameTest","address 1",
                "1234567890", "test@test.com", "English", "Australia",
                "Java", "1990", "October", "12", "Proba123@",
                "Proba123@",
                "D:/Curs/testGit/AutomationFramework/src/test/resources/image.jpg");

    }
}



//public class RegisterTest extends BaseTest {
//    public RegisterTest() {
//        super(driver);
//    }
//    @Test
//    public void registerTest(){
//
//        ElementMethods elementMethods = new ElementMethods(Driver);
//        PageMethods pageMethods=new PageMethods(Driver);
//
//
//        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
//        skipSignInElement.click();
//
//        String expectedPage="Register";
//        String actualpage=Driver.getTitle();
//        Assert.assertTrue("The expected page was notDisplayed",expectedPage.equals(actualpage));
//
//
//        WebElement firstNameElement=Driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
//        String nameValue="laurentiu";
//        firstNameElement.sendKeys(nameValue);
//
//        WebElement lastNameElement=Driver.findElement(By.cssSelector("input[ng-model='LastName']"));
//        String lastValue="deac";
//        lastNameElement.sendKeys(lastValue);
//
//        WebElement adressElement=Driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
//        String adressValue="Floresti, Tautiului ";
//        adressElement.sendKeys(adressValue);
//
//
//        WebElement emailAddressElement=Driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
//        String emailAddressValue="java@gmail.com";
//        emailAddressElement.sendKeys(emailAddressValue);
//
//        WebElement phoneElement=Driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
//        String phoneValue="003467578";
//        phoneElement.sendKeys(phoneValue);
//
//
//        WebElement genderElement=Driver.findElement(By.cssSelector("input[value='Male']"));
//        genderElement.click();
//
//
//        WebElement hobbiesElement=Driver.findElement(By.id("checkbox1"));
//        hobbiesElement.click();
//
//
//        WebElement skillsElement=Driver.findElement(By.id("Skills"));
//        Select skillsDropDown=new Select(skillsElement);
//        skillsDropDown.selectByVisibleText("APIs");
//
//
//        JavascriptExecutor js = (JavascriptExecutor) Driver;
//        js.executeScript("window.scrollBy(0,250)", "");
//
//        WebElement languageElement= Driver.findElement(By.id("msdd"));
//        languageElement.click();
//
//        List<WebElement> languageOption= Driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
//        Integer index=0;
//        while (index<languageOption.size()){
//            if (languageOption.get(index).getText().equals("Arabic")){
//                languageOption.get(index).click();
//                break;
//            }
//            index++;
//        }
//        genderElement.click();
//
//
//
//        WebElement countryElement =Driver.findElement(By.xpath("//span[@role='combobox']"));
//        countryElement.click();
//
//        WebElement m= Driver.findElement(By.xpath("//input[@role='textbox']"));
//        m.sendKeys("Denmark");
//        m.sendKeys(Keys.ENTER);
//
//
//        WebElement yearElement = Driver.findElement(By.id("yearbox"));
//        Select yaerDropown = new Select(yearElement);
//        yaerDropown.selectByValue("1990");
//
//        WebElement monthElement = Driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
//        elementMethods.selectTextElement(monthElement,"October");
//        /* Var1
//        Select monthDropown = new Select(monthElement);
//        monthDropown.selectByVisibleText("October");
//        */
//
//        WebElement dayElement = Driver.findElement(By.id("daybox"));
//        elementMethods.selectValueElement(dayElement,"19");
//
////        Var2
//////        Select dayDropown = new Select(dayElement);
//////        dayDropown.selectByValue("19");
//
//
//        WebElement passwordElement=Driver.findElement(By.id("firstpassword"));
//        String passwordValue="1234567890";
//        passwordElement.sendKeys(passwordValue);
//
//
//        WebElement confirmPasswordElement=Driver.findElement(By.id("secondpassword"));
//        String confirmPasswordValue="1234567890";
//        confirmPasswordElement.sendKeys(confirmPasswordValue);
//
//
//
//        WebElement uploudElement=Driver.findElement(By.id("imagesrc"));
//        uploudElement.sendKeys("D:\\Poze\\picisto-20140915160203-943903.jpg");
//
//
//
//    }
//}
