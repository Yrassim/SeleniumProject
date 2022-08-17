package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser {
    private static WebDriver driver;

    public static String getPropretyValue(String propretyName){
        String propretyValue = "";
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/info.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            propretyValue = properties.getProperty(propretyName);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       return propretyValue;
    }

    public static void setDriver(){
        String driverValue = getPropretyValue("browser");

        if(driverValue.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(driverValue.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
