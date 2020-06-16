package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/features",
        glue = {""},
        tags = {"@ValidaPesquisa"},
        plugin = {"pretty"},
        monochrome = true)

public class Runner {
}
