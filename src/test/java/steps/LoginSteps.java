package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @When("User enters the username and password")
    public void user_enters_the_username_and_password() {
        sendToText(loginPage.loginUserNameField, ConfigReader.getPropertyValue("username"));
        sendToText(loginPage.loginPasswordField, ConfigReader.getPropertyValue("password"));
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);

    }
    @Then("User successfully logged in")
    public void user_successfully_logged_in() {
        Assert.assertTrue(dashboardPage.welcomeText.isDisplayed());
    }
}
