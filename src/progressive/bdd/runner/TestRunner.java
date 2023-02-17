package progressive.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "progressive.bdd.steps",
		"progressive.bdd.base" }, tags = "@datadriven", plugin = { "pretty", "html:target/Report.html",
				"json:target/Report.json" }, monochrome = true, dryRun = false)
public class TestRunner {

}
