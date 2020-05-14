package CucumberOptions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@Category(EndToEndTest.class)
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Platform.feature", // It will run all the feature, but if u use /Login.feature then it will run only /login.feature
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		tags = { "@EndToEndTest"},
		plugin= {"pretty", "json:target/cucumber-reports/Cucumber.json",
				 "junit:target/cucumber-reports/Cucumber.xml",
				 "html:target/Test-reports"
				}
		
		)

public class TestRunner {

}
