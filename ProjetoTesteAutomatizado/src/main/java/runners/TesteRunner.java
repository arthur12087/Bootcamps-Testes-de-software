package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features"
        ,glue = {"stepdefinitions"}
        ,tags = "@SmokeTest"
        )


public class TesteRunner {
}
