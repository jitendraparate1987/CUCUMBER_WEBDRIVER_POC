package StepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features="src/test/java/Features",
		 glue="StepDefinitions",
		 monochrome = true,
		 dryRun = false,
		 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				 "rerun:target/rerun.text",
				 "html:target/cucumber-report.html",
				 "json:target/cucumber-report.json"
		 }
		)
	


public class TestRunner {
	
}
