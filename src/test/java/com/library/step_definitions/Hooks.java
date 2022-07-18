package com.library.step_definitions;

import com.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static io.restassured.RestAssured.baseURI;

public class Hooks {

    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

    @Before ("@api")
    public static void init() {
        //save baseURL inside this variable so that we don't need to type each http method.
        baseURI = "http://52.90.77.197:8000";
    }


}
