package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {"pretty",
                "html:Reports/HTMLReports/cucumber-html-report",
                "json:Reports/JSONReports/cucumber.json",
                "junit:Reports/JUNitReports/cucumber.xml"
        },
        monochrome = true
)
public class TestRunner {
}
