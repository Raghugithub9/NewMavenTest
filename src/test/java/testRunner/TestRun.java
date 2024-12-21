package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
	features={".//Features/login2.feature"},
	glue="stepDefinitions",
	tags = {"@Regression"},
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output"}
	)

public class TestRun{
	
}
