package pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css = "input[name='username']") private WebElement userNameElement;
    @FindBy(css = "input[name='password']") private WebElement passwordElement;
    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']") private  WebElement submitButton;

    public BoardPage loginToBoard(){
        userNameElement.sendKeys(Info.USER_NAME);
        passwordElement.sendKeys(Info.PASSWORD);

        submitButton.click();

        return PageFactory.initElements(Browser.driver, BoardPage.class);
    }

}
