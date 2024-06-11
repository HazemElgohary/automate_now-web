import Pages.BasePage;
import Pages.PopUpPages;
import org.testng.annotations.Test;

public class PopUp_Test extends Base_test
{
    public void ToPopPage() throws InterruptedException {
        BasePage.Smallscrolldown(driver);
        Thread.sleep(1000);
        BasePage.PopUp(driver).click();
    }
    @Test
    public void AlertPopUp() throws InterruptedException
    {
        ToPopPage();
        PopUpPages.Alert_PopUp(driver).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        //driver.get("https://practice-automation.com/");

    }
    @Test
    public void ConfirmPopUp() throws InterruptedException {
        ToPopPage();
        PopUpPages.Confirm_PopUp(driver).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        PopUpPages.Confirm_PopUp(driver).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        //driver.get("https://practice-automation.com/");

    }
    @Test
    public void PromptPopUp() throws InterruptedException {
        ToPopPage();
        PopUpPages.Prompt_PopUp(driver).click();
        driver.switchTo().alert().sendKeys("test");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }
}
