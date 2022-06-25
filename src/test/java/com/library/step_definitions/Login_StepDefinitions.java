package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationProperties;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage page = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationProperties.getProperty("url"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        page.emailInput.sendKeys("librarian1@library");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        page.passwordInput.sendKeys("rs4BNN9G");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        page.emailInput.sendKeys("student1@library");
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        page.passwordInput.sendKeys("i2A9TgXa");
    }

    @When("user clicks sign-in button")
    public void user_clicks_sign_in_button() {
        page.signInButton.click();
    }

    @Then("user should see the user avatar")
    public void user_should_see_the_user_avatar() {
        Assert.assertTrue(page.userAvatar.isDisplayed());
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        page.emailInput.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        page.passwordInput.sendKeys(string);
    }

    @When("user enters username {string}, password {string} and clicks signIn Button")
    public void user_enters_username_password_and_clicks_sign_ın_button(String username, String password) {
        page.emailInput.sendKeys(username);
        page.passwordInput.sendKeys(password);
        page.signInButton.click();
    }

    @Then("user should see username in the account section")
    public void user_should_see_username_in_the_account_section() {
        Assert.assertTrue(dashboardPage.accountSection.isDisplayed());
    }
}
