package bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
				 glue = {"bdd.steps","bdd.base"},
				 tags = "@calc",
				 plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
				 monochrome = true,
				 dryRun = false)
public class TestRunner {

}
