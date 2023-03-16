package cydeo.step_definitions;

import cydeo.pages.LoginPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("Navigate to the page")
    public void navigate_to_the_page() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/login?clear=1");
    }

    @When("input username")
    public void input_username() {

        BrowserUtils.sleep(1);
        loginPage.inputUserName.sendKeys("Employee1");


    }

    @Then("input password")
    public void input_password() {

        BrowserUtils.sleep(1);
        loginPage.inputPassword.sendKeys("Employee123");

    }

    @Then("click login button")
    public void click_login_button() {

        BrowserUtils.sleep(1);
        loginPage.loginButton.click();
        BrowserUtils.sleep(3);
    }

}
