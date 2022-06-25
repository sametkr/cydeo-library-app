package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationProperties;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage page = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationProperties.getProperty("url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        page.emailInput.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        page.passwordInput.sendKeys(string);
    }
    @When("user clicks signIn button")
    public void user_clicks_sign_ın_button() {
        page.signInButton.click();
    }
    @Then("user should see the user avatar")
    public void user_should_see_the_user_avatar() {
        Assert.assertTrue(page.userAvatar.isDisplayed());
    }
}
