import Pages.BasePage;
import Pages.CalenderPage;
import Pages.FiledownloadPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FileDownload_test extends Base_test
{
    @Test
    public void Downloadtest() throws InterruptedException
    {
         BasePage.File_download(driver).click();
         Thread.sleep(1000);
        Object[] windowHandles=driver.getWindowHandles().toArray();

        FiledownloadPage.Download(driver).click();

        System.out.println("######################################################################################");


        Thread.sleep(3000);
      //  driver.switchTo().alert().sendKeys(String.valueOf(Keys.ENTER));
        //driver.switchTo().defaultContent();

        driver.switchTo().window((String) windowHandles[0]);




    }
}
