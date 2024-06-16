import Pages.BasePage;
import Pages.CalenderPage;
import Pages.PopUpPages;
import org.testng.annotations.Test;

public class Calender_Test extends Base_test
{
    @Test
    public void ValidDate() throws InterruptedException
    {
        BasePage.Longscrolldown(driver);
        Thread.sleep(1000);
        BasePage.Calenders(driver).click();
        CalenderPage.Text(driver).sendKeys("2020-10-10");
        CalenderPage.Submit(driver).click();

    }
}
