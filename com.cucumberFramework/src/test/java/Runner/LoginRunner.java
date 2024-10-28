package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions
(
           features = {"src/test/java/Feature/Login.feature"},
           glue = "Steps",
           dryRun = true,
           snippets =SnippetType.CAMELCASE,
           monochrome =true
          
  )
public class LoginRunner extends AbstractTestNGCucumberTests {
 
}

