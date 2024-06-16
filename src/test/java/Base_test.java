import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Base_test
{
    WebDriver driver;
    @BeforeSuite
    public void DeclareDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
    }
    @BeforeClass
    public void Website()
    {


    }
    @BeforeMethod
    public void Home_Before() throws InterruptedException {
        Thread.sleep(500);
    }
    @AfterMethod
    public void Home_After() throws InterruptedException {
        Thread.sleep(1000);

        //driver.navigate().to("https://practice-automation.com/");
       driver.get("https://practice-automation.com/");
        Thread.sleep(1000);


    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
