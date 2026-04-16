package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"src/test/java/features"},
                glue = {"stepDefinitions"},
                tags = "@abcd",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty", "html:target/test_output/cucumber.html", "json:target/test_output/cucumber.json",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner {
}
