package com.birtrix.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/report.html",
        features = "src/test/resources/features",
        glue = "com/birtrix/stepdefinition",
        tags = "",
        dryRun =false

)


public class CucksRunner {
}
