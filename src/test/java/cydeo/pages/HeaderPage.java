package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {
    public HeaderPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//ul[@id='appmenu']//a")
    public WebElement filesButton;



}
