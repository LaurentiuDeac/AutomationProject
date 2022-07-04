package tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import base.BaseTest;
import org.junit.Test;

public class WindowTest extends BaseTest {
    public WindowTest() {
    }



    @Test
    public void windowTest() {
        IndexPage indexPage = new IndexPage(this.getDriver());
        indexPage.clickSkipSignIn();
        RegisterPage registerPage = new RegisterPage(this.getDriver());
        registerPage.goToWindowPage();
        WindowPage windowPage = new WindowPage(this.getDriver());
        windowPage.dealWithTab(1);
        windowPage.dealWithWindow(1);
        windowPage.dealWithMultipleTab(2);
    }
}




//public class  WindowsTest extends BaseTest {
//
//    public WindowsTest() {
//        super(driver);
//    }
//
//    @Test
//
//    public void windowsTest(){
//
//        ElementMethods elementMethods=new ElementMethods(Driver);
//        PageMethods pageMethods=new PageMethods(Driver);
//        TabMethods tabMethods=new TabMethods(Driver);
//
//        WebElement skipSignInElement = Driver.findElement(By.id("btn2"));
//        skipSignInElement.click();
//
//        String expectedPage="Register";
//        String actualpage=Driver.getTitle();
//        Assert.assertTrue("The expected page was notDisplayed",expectedPage.equals(actualpage));
//
//        WebElement windowsElement= Driver.findElement (By.xpath("//a[text()='SwitchTo']"));
//        Actions action = new Actions(Driver);
//        action.moveToElement(windowsElement).build().perform();
//
//        WebElement alertsElement= Driver.findElement(By.xpath("//a[text()='Windows']"));
//        alertsElement.click();
//        Driver.navigate().to("http://demo.automationtesting.in/Windows.html");
//
//        List<WebElement> windowsButtons=Driver.findElements(By.cssSelector(".analystic"));
//        windowsButtons.get(0).click();
//        WebElement clickTabElement=Driver.findElement(By.cssSelector("#Tabbed>a>button"));
//        clickTabElement.click();
//
//        List<String> tabList= new ArrayList<>(Driver.getWindowHandles());
//        Driver.switchTo().window(tabList.get(1)); // m-am mutat pe tab-ul 2
//        System.out.println(Driver.getTitle());
//        Driver.close();
//        Driver.switchTo().window(tabList.get(0)); // mergem pe primul tab
//        windowsButtons.get(1).click();
//        WebElement clickWindowElement=Driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
//        clickWindowElement.click();
//
//        List<String> windowList=new ArrayList<>(Driver.getWindowHandles());
//        Driver.switchTo().window(windowList.get(1));
//        System.out.println(Driver.getTitle());
//        Driver.close();
//        Driver.switchTo().window(windowList.get(0));
//
//        windowsButtons.get(2).click();
//        WebElement multiWindElement=Driver.findElement(By.cssSelector("#Multiple>button"));
//        multiWindElement.click();
//
//        tabMethods.switchSpecificTabWindow(2);
//        tabMethods.closeCurrentTabWindo();
////        List<String> multipleTabList=new ArrayList<>(Driver.getWindowHandles());
////        Driver.switchTo().window(multipleTabList.get(2));
////        System.out.println(Driver.getTitle());
////        Driver.close();
//
//        tabMethods.switchSpecificTabWindow(1);
//        tabMethods.closeCurrentTabWindo();
////        Driver.switchTo().window(multipleTabList.get(1));
////        System.out.println(Driver.getTitle());
////        Driver.close();
//
//        tabMethods.switchSpecificTabWindow(0);
//        tabMethods.closeCurrentTabWindo();
////        Driver.switchTo().window(multipleTabList.get(0));
////        System.out.println(Driver.getTitle());
////        Driver.close();




