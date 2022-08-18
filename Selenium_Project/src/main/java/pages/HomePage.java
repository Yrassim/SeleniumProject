package pages;

import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static browser.Browser.getPropretyValue; // using this import to avoid writing Browser.getPropertyValue everytime.

public class HomePage {

    WebDriver driver = Browser.getDriver(); // we have to repeat that to use it in the screenShot methode.

    @FindBy(linkText = "Register") private WebElement registerLink;//customer.firstName
    @FindBy(id = "customer.firstName") private WebElement firstName;
    @FindBy(id = "customer.lastName") private WebElement lastName;
    @FindBy(id = "customer.address.street") private WebElement address;
    @FindBy(id = "customer.address.city") private WebElement city;
    @FindBy(id = "customer.address.state") private WebElement state;
    @FindBy(id = "customer.address.zipCode") private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber") private WebElement phoneNumber;
    @FindBy(id = "customer.ssn") private WebElement ssn;
    @FindBy(id = "customer.username") private WebElement userName;
    @FindBy(id = "customer.password") private WebElement password;
    @FindBy(id = "repeatedPassword") private WebElement repeatedPassword;
    @FindBy(css = "input[value='Register']") private WebElement registerButton;

    public OverViewPage registerUser(){

        registerLink.sendKeys(Browser.getPropretyValue("info"));
        firstName.sendKeys(getPropretyValue("info")); // we can remove "Browser." because we import it up here.
        String info = getPropretyValue("info"); // to avoid repeated request
        lastName.sendKeys(info);
        address.sendKeys(info);
        city.sendKeys(info);
        state.sendKeys(info);
        zipCode.sendKeys(info);
        phoneNumber.sendKeys(info);
        ssn.sendKeys(info);
        userName.sendKeys(getPropretyValue("userName"));
        password.sendKeys(getPropretyValue("password"));
        repeatedPassword.sendKeys(getPropretyValue("password"));
        registerButton.click();

        return PageFactory.initElements(Browser.getDriver(), OverViewPage.class);

    //this is on the preview class learned and I don't want to delete it.
    //    @FindBy(id = "txtUsername") private WebElement userNameElement;
//    @FindBy(id = "txtPassword") private WebElement passwordElement;
//    @FindBy(id = "btnLogin") private WebElement LoginButton;
//
//   // @FindBy(how = How.ID,using = "btnLogin") // same thing with the preview command.
//
//    public void LogIn(){
//        userNameElement.sendKeys(Browser.getPropretyValue("userName"));
//        passwordElement.sendKeys((getPropretyValue("password"))); // removing "Browser." because we import it up here.
//        LoginButton.click();
    }

//This following part is transferred to TestNgListener Class and call it from HomPageTest
    //    public void screenShot(){
//        final String path = "src/main/java/screenShot";
//        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File destFile = new File(path+"test.png");
//
//        try {
//            FileUtils.copyFile(screenShot, destFile);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
