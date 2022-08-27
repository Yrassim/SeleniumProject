package pages;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {
    WebDriver driver;

    @FindBy(css = "a[href='/web/index.php/pim/viewMyDetails']") private WebElement MyInfoButton;

    public MyInfoPage goToMyInfo(){
        MyInfoButton.click();

        return PageFactory.initElements(Browser.driver, MyInfoPage.class);
    }
}
