package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features= {"src/test/java/Feature/Meesho.Feature"},
	 glue="Steps",
	 dryRun = true,
     snippets =SnippetType.CAMELCASE
	 )
public class Meesho extends AbstractTestNGCucumberTests {

}
