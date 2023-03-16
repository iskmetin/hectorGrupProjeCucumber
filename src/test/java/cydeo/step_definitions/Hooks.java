package cydeo.step_definitions;

import cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks {
    //import from io.cucumber.java not from junit
    @Before(order = 1)
    public void setupScenario(Scenario scenerio) {
        System.out.println("Scenerio is started:"+scenerio.getId());
        System.out.println("Scenerio is started:"+scenerio.getName());
    }

    //@Before (value = "@login", order = 2)
    public void setupScenarioForLogins() {
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    //@Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("====this will only apply to scenarios with @db tag");
    }


    @After
    public void teardownScenario(Scenario scenario) {

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()) {

            TakesScreenshot screenshot = ((TakesScreenshot) Driver.getDriver());
            File ss=screenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(ss, new File("target/FailedScreenShots/"+
                        Driver.getDriver().getTitle()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //BrowserUtils.sleep(5);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    // @BeforeStep
    public void setupStep() {
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep() {
        System.out.println("--------> applying tearDown using @AfterStep");
    }


}

