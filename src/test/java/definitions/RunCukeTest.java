package definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "Happy.step_definitions", plugin = {
		"pretty", "html:target/cucumber", })
public class RunCukeTest {

}
