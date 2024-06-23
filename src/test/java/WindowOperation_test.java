import Pages.BasePage;
import Pages.SliderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowOperation_test extends Base_test
{
    @Test (priority = 0)
    public void NewTab() throws InterruptedException
    {
        BasePage.Window_Operations(driver).click();


    }
    @Test (priority = 1)

    public void ReblaceTab() throws InterruptedException
    {


    }
    @Test (priority = 2)

    public void NewWindow() throws InterruptedException
    {


    }

}
