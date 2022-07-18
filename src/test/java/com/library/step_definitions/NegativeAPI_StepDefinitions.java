package com.library.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

public class NegativeAPI_StepDefinitions {
    Response response;

    @When("user sends GET request to")
    public void user_sends_get_request_to_api_spartans() {
        response = given().accept(ContentType.JSON)
                .and().pathParam("id", 500)
                .when().get("/api/spartans/{id}");
    }
    @Then("response status code should be {int}")
    public void response_status_code_should_be(Integer int1) {
        Assert.assertEquals(404, response.statusCode());
        Assert.assertEquals("application/json", response.contentType());
        Assert.assertTrue(response.body().asString().contains("Not Found"));
    }




}
