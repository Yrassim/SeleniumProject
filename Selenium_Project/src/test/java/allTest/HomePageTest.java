package allTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;

@Listeners(value = TestListener.class) // this is the listener for the screenShot.

public class HomePageTest extends BaseTest{ // extend that class to add BaseTest
    WebDriver driver = Browser.getDriver();

    @Test
    public void test1(){
        //System.out.println("This is a test");
        //PageFactory.initElements(driver, HomePage.class) //Moved to BaseTest to make it nice
        startHomePage()
                .registerUser();
        Assert.assertEquals(4,5);
    }
}
