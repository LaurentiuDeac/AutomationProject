package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {
    //public WebDriver driver;
    //  public ElementMethods elementMethods;


    public IndexPage(WebDriver driver){
        //this.driver = driver;
        //elementMethods = new ElementMethods(this.driver);
        //trebuie sa initializam elementele de pe pagina
        //PageFactory.initElements(driver, this);

        super(driver);

    }

    @FindBy(id = "btn1")
    private WebElement signInElement;
    @FindBy(id = "btn2")
    private WebElement skipSignInElement;

    public void clickSignIn(){
        elementMethods.clickElement(signInElement);

    }
    public void clickSkipSignIn(){
        elementMethods.clickElement(skipSignInElement);
    }
}
