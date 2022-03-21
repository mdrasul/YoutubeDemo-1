package ARunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/1_Login.feature",
		glue={"stepdefinationcode"},
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		//tags = "@wait",
		monochrome=true,
		snippets = SnippetType.CAMELCASE
		)

public class RunCucumberTest {

}
