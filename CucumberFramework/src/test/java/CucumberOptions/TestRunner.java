package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features/Login.feature",
		glue="stepDefinations"
		)

public class TestRunner {
	
	//this is an update
}
