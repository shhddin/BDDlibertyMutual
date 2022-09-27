package bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/calculate.feature",
				 glue = {"bdd.stepdefinition","bdd.base"},
				 tags = "  @calculate",
				 plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
				 monochrome = true,
				 dryRun = false)
public class CalcTestRunner {

}
