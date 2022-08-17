package allTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        Browser.setDriver();
        driver = Browser.getDriver();
        driver.navigate().to(Browser.getPropretyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test1(){
        System.out.println("This is a test");
    }
}
