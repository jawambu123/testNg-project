package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\njewa\\eclipse-workspace\\mycucumber_project\\src\\test\\java\\features\\background.feature", glue = "stepDefinations")
public class ChangeBackgroundTestRunner {

}
