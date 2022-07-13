package Pages;

import Objects.FrameObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{


    public FramePage(WebDriver driver) {
        super(driver);
        pageMethods.waitForUrl("Frames");
    }

    @FindBy(css = ".nav-tabs>li>a")
    private List<WebElement>FrameOption;
    @FindBy(css = "input[type='text']")
    private  WebElement inputText;


    public void singleFrameProccess(FrameObject frameData){

        elementMethods.waitForElement(FrameOption.get(0));
        elementMethods.clickElement(FrameOption.get(0));
        frameMethods.switchFramebyValue("singleframe");
        elementMethods.fillElement(inputText, frameData.getSingleiFrame());
        frameMethods.switchToDefaultFrame();


    }



}
