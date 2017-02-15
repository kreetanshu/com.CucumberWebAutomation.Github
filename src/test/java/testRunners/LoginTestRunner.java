package testRunners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={".\\src\\test\\java\\features"}, glue ={"stepDefinitions"}, tags ={"@sanity,@regression"}, strict=true,plugin = { "progress",
		"html:target/Cucumber"
		})
public class LoginTestRunner {

}
