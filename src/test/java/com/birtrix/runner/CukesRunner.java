package com.birtrix.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/report.html",
                 "json:target/json.json",
                 "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/birtrix/stepdefinition",
        tags = "@wip",
        dryRun = false
)


public class CukesRunner {
}
