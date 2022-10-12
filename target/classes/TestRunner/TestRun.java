package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty","html: target/reports"},
        features = {"src/main/resources/Feature"},
        tags = "@SmokeTest",
        glue = "Stepdefine"
)
public class TestRun {
}
