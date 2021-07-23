package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="E:/selenium/Rijul/src/test/java/features/PropVivoLogin.feature",
			glue= {"stepDefinition"},
			
					
    plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
			//plugin = {"pretty", "html:target/test-output"},
			tags= "@smoketest1 or @smoketest2"
			)
			/*tags= {"@SmokeTest1 or @SmokeTest2 or @SmokeTest3 or @SmokeTest4 or @SmokeTest5"}*/
			
			


	public class Runner
	{}
