package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:Features",
        glue = "StepDefinitions",
        monochrome = true
)
public class FullRunner extends AbstractTestNGCucumberTests {
}