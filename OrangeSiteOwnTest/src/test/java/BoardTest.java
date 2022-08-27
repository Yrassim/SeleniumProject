import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BoardTest extends TestBase{

    WebDriver driver;

    @Test
    public void test1(){

        startLoginPage()
                .loginToBoard()
                .goToMyInfo()
                .jobSection()
                .validatingSubUnit("Human Resources");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
