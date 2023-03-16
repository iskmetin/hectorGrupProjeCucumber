package cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }


    public static WebElement waitForVisibility(WebElement element,int timeToWaitInSec){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void scrollToElement(WebElement element){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("argument[09.scrollIntoView(true);",element);
    }


}
