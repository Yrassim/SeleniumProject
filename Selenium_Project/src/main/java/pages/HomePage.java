package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.Browser.getPropretyValue; // using this import to avoid writing Browser.getPropertyValue everytime.

public class HomePage {

    @FindBy(id = "txtUsername") private WebElement userNameElement;
    @FindBy(id = "txtPassword") private WebElement passwordElement;
    @FindBy(id = "btnLogin") private WebElement LoginButton;

   // @FindBy(how = How.ID,using = "btnLogin") // same thing with the preview command.

    public void LogIn(){
        userNameElement.sendKeys(Browser.getPropretyValue("userName"));
        passwordElement.sendKeys((getPropretyValue("password"))); // removing "Browser." because we import it up here.
        LoginButton.click();
    }
}
