package com.birtrix.stepdefinition;

import com.birtrix.utilites.ConfiReader;
import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getDriver().get(ConfiReader.getProperty("env"));
    }
    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
        }



        Pages.closePages();
        Driver.closeDriver();


    }
}
