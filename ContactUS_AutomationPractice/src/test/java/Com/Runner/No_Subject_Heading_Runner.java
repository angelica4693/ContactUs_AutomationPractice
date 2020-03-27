package Com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Contact.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC_003"},
		glue="Com.Definition",
		monochrome=true
		)
public class No_Subject_Heading_Runner {

}
