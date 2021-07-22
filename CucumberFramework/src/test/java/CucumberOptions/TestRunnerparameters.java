package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features/Loginparameters.feature",
		glue="stepDefinations"
		)

public class TestRunnerparameters {
	
	
}
