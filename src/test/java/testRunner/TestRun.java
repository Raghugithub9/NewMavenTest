package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
	features={".//Features/login2.feature",".//Features/login.feature"},
	glue="stepDefinitions",
	tags = {"@smoke"},
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output/report.html"}
	)

public class TestRun{
	
}