package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.Instant;

import static drivers.DriverFactory.cleanupDriver;
import static drivers.DriverFactory.getDriver;

public class Hooks {
    public WebDriver driver;

    @Before
    public void setUp() {
        getDriver();

    }
    @AfterStep
    public void captureExceptionimage(Scenario scenario){
        if(scenario.isFailed()){
            long timestamp=12345678;
            Instant instantLong = Instant.ofEpochMilli(timestamp);
         String    instantMili = instantLong.toString();
         byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot,"image/png",instantMili );

        }

    }

    @After
    public void tearDown(){

        cleanupDriver();
    }


}


