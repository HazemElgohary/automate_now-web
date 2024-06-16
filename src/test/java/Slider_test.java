import Pages.BasePage;
import Pages.SliderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Slider_test extends Base_test
{

   @Test
    public void Slider() throws InterruptedException {
       BasePage.Longscrolldown(driver);
       // driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
       Thread.sleep(1000);
        BasePage.Sliders(driver).click();
       for (int i=0;i<25;i++) {
           SliderPage.Slider(driver).sendKeys(Keys.ARROW_RIGHT);
       }
      String value= driver.findElement(By.id("value")).getText();
       Assert.assertEquals(value,"50");

    }



}
