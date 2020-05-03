package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/USER/eclipse-workspace/learnjava/src/main/java/Features/searchJob.feature",
		glue={"stepDefinition"},
		monochrome = true,
		format = {"pretty","html:test-outout"},
		dryRun = false
		
		)
			
public class TestRunner {		

}
