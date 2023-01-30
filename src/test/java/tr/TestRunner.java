package tr;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
        },

        features = {"D:/Skolan/AAA-AT/projects/final-projekt2/projectG3Owner/src/test/resources/features/AddItemToCard.feature"}
        ,glue={"stepDefinitionsPOM"}


)


public class TestRunner extends AbstractTestNGCucumberTests {

}

