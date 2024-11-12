package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@wip",
        glue = {"steps"},
        plugin = {"html:target/generated-reports/cucumber.html", "json:target/generated-reports/cucumber.json"},
        features = {"src/test/resources/features"})

public class Runner extends AbstractTestNGCucumberTests {

}
