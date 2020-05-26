package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json",
        "junit:target_junit/cucumber.xml"},tags = {"@weatherMap"},features = {"src/test/resources/features"},glue = {"stepDefinitions"})

public class Runner {


}
