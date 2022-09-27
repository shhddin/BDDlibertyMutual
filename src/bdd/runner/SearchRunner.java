package bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/searchSomethingN.feature",
				 glue = {"bdd.stepdefinition","bdd.base"},
				 tags = " @searchNow",
				 plugin = {"pretty","html:target/Report.html", "json:target/Report.json"},
				 monochrome = true,
				 dryRun = false)
public class SearchRunner {

}
