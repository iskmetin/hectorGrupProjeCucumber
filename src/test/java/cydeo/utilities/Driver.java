package cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Driver {

    private static WebDriver driver;

    private Driver() {
    }


    public static WebDriver getDriver() {

        if (driver == null) {


            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "remote-chrome":
                    try{
                        String gridAddress="18.210.13.118";
                        URL url=new URL("http://"+gridAddress+":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        driver=new RemoteWebDriver(url,desiredCapabilities);
                    }catch(Exception e){
                        e.printStackTrace();

                    }
                    break;

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
            }


        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
