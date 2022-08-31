package ds.anosov.framework;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"ds.anosov.framework.steps"},
        features = {"src/test/resources/scenario"},
        tags = "@test"
)

public class CucumberRunner {
}
