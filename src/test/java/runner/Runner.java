package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@wip",
        glue = {"steps"},
        plugin = {"html:target/generated-reports/cucumber.html", "json:target/generated-reports/cucumber.json"},
        features = {"src/test/resources/features"})

public class Runner {

}
