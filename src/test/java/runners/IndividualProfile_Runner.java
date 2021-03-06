package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\amalitech_wksp_java\\democommunityproject\\CucumberFramework\\src\\test\\java\\features"},
		glue = {"stepDefinitions"},
		monochrome = true,
				plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }
		
		)
public class IndividualProfile_Runner extends AbstractTestNGCucumberTests{

}
