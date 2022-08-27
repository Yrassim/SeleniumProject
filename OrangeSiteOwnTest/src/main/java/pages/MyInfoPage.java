package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyInfoPage {

    WebDriver driver;

    @FindBy(css = "a[href='/web/index.php/pim/viewJobDetails/empNumber/7']") private WebElement jobSectiionLink;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/div[1]")
    private WebElement subUnit;

    public MyInfoPage jobSection(){
        jobSectiionLink.click();

        return this;
    }

    public MyInfoPage validatingSubUnit(String name){
        Assert.assertEquals(subUnit.getText(),name);
        return this;
    }
}
