package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/orangehrm.feature",
glue= {"steps"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports/reports.html"})
public class Runner {

}
 