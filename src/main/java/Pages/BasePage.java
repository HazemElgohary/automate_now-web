package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage
{

    static By javascriptdelays_btn =By.xpath("//a[@href='https://practice-automation.com/javascript-delays/']");
    static By formdields_btn =By.xpath("//a[@href=\"https://practice-automation.com/form-fields/\"]");
    static By popup_btn =By.xpath("//a[@href=\"https://practice-automation.com/popups/\"]");
    static By slider_btn =By.xpath("//a[@href=\"https://practice-automation.com/slider/\"]");

    static By calender_btn =By.xpath("//a[@href=\"https://practice-automation.com/calendars/\"]");

    static By modals_btn =By.xpath("//a[@href=\"https://practice-automation.com/modals/\"]");
    static By tables_btn =By.xpath("//a[@href=\"https://practice-automation.com/tables/\"]");
    static By windowperation_btn =By.xpath("//a[@href=\"https://practice-automation.com/window-operations/\"]");
    static By hover_btn =By.xpath("//a[@href=\"https://practice-automation.com/hover/\"]");
    static By ads_btn =By.xpath("//a[@href=\"https://practice-automation.com/ads/\"]");
    static By gesture_btn =By.xpath("");
    static By filedownload_btn =By.xpath("");
    static By clickevent_btn =By.xpath("");
    static By spinners_btn =By.xpath("");
    static By fileupload_btn =By.xpath("");
    static By iframs_btn =By.xpath("");
    static By brokenimages_btn =By.xpath("");
    static By brokenlinks_btn =By.xpath("");
    static By accordions_btn =By.xpath("");


    static public WebElement JavaScriptDelays(WebDriver driver)
    {
        WebElement JavaScriptDelays= driver.findElement(javascriptdelays_btn);
        return JavaScriptDelays;
    }
    static public  WebElement FormFields(WebDriver driver)
    {
        WebElement formfields=driver.findElement(formdields_btn);
        return formfields;
    }
    static public  WebElement PopUp (WebDriver driver)
    {
        WebElement Popup =driver.findElement(popup_btn);
        return Popup;
    }
    static public  WebElement Sliders (WebDriver driver)
    {
        WebElement Sliders =driver.findElement(slider_btn);
        return Sliders;
    }
    static public  WebElement Calenders (WebDriver driver)
    {
        WebElement Calenders =driver.findElement(calender_btn);
        return Calenders;
    }

    static public  WebElement Modals (WebDriver driver)
    {
        WebElement Modals=driver.findElement(modals_btn);
        return Modals;
    }
    static public  WebElement Tables(WebDriver driver)
    {
        WebElement Tables=driver.findElement(tables_btn);
        return Tables ;
    }
    static public  WebElement  Window_Operations(WebDriver driver)
    {
        WebElement Window_Operations=driver.findElement(windowperation_btn);
        return Window_Operations;
    }
    static public  WebElement Hover (WebDriver driver)
    {
        WebElement Hover=driver.findElement(hover_btn);
        return Hover ;
    }
    static public  WebElement Ads (WebDriver driver)
    {
        WebElement Ads =driver.findElement(ads_btn);
        return Ads;
    }
//    static public  WebElement (WebDriver driver)
//    {
//    WebElement =driver.findElement(formdields_btn);
//    return ;
//    }
    public static void  Smallscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,500)");

    }
    public static void  Longscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,800)");

    }
    public static void  Smallscrollup(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(700,0)");

    }
}
