package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.UsersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResult_StepDefinitions {

    UsersPage usersPage = new UsersPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks on Users button")
    public void user_clicks_on_users_button() {
        dashboardPage.usersButton.click();
    }
    @Then("user should see all the following columns")
    public void user_should_see_all_the_following_columns(List<String> expectedColumnsHeader) {

        List<String> actualColumnsHeader = new ArrayList<>();

        for (WebElement eachElement : usersPage.columnsHeader) {
            actualColumnsHeader.add(eachElement.getText());
        }

        Assert.assertTrue(actualColumnsHeader.containsAll(expectedColumnsHeader));
    }
}

