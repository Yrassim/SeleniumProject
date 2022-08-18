package allTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTest { // we will use extend to call that class

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        Browser.setDriver();
        driver = Browser.getDriver();
        driver.navigate().to(Browser.getPropretyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public HomePage startHomePage(){
        return PageFactory.initElements(driver, HomePage.class);
    }
}
