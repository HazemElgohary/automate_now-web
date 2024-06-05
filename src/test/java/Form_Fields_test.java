import Pages.BasePage;
import Pages.FormFieldsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Form_Fields_test extends Base_test
{
    @Test
    public void check_Form_Fields() throws InterruptedException
    {
        BasePage.Smallscrolldown(driver);
     BasePage.FormFields(driver).click();
        FormFieldsPage.Name(driver).sendKeys("aboalahd TEST");
        List<WebElement> elements =driver.findElements(By.name("fav_drink"));
        for(int i=0;i<elements.size();i++)
        {
            WebElement elem=elements.get(i);
            System.out.println(elements.get(i));
            elem.click();
            //kda msh mhtag a3ml click 3la kol locators bnfsy

        }


    }

}

