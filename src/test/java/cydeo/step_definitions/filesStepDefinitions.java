package cydeo.step_definitions;

import cydeo.pages.FilesPage;
import cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class filesStepDefinitions {
    FilesPage filesPage=new FilesPage();



    @Then("click all button")
    public void click_all_button() {
        for (int i=0;i<filesPage.leftMenu.size()-1;i++){
            filesPage.leftMenu.get(i).click();
            BrowserUtils.sleep(1);
        }
    }
    @Then("click recent button")
    public void click_recent_button() {
        filesPage.recentButton.click();
    }
}
