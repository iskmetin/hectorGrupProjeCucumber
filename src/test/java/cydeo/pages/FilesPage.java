package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }





    @FindBy(xpath="//ul[@class='with-icon']/li/a")
    public List<WebElement> leftMenu;


    @FindBy(xpath="(//ul[@class='with-icon']/li/a)[1]")
    public WebElement allFilesButton;
    @FindBy(xpath="(//ul[@class='with-icon']/li/a)[2]")
    public WebElement recentButton;
    @FindBy(xpath="(//ul[@class='with-icon']/li/a)[3]")
    public WebElement favoritesButton;
    @FindBy(xpath="(//ul[@class='with-icon']/li/a)[4]")
    public WebElement sharedButton;
    @FindBy(xpath="(//ul[@class='with-icon']/li/a)[5]")
    public WebElement tagsButton;
    @FindBy(xpath = "(//ul[@class='with-icon']/li/a)[6]")
    public WebElement deletedFilesButton;



}

