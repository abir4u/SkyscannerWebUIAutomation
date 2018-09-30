import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by abir on 26/09/18.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
        glue = {"SkyscannerStepDefs"},
        plugin = { "html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt"}
)
public class TestRunner {
}
