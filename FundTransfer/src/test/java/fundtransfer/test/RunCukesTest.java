package fundtransfer.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
		plugin = {"pretty", "html:target/report/report.html",
        "json:target/report/cucu_json_report.json",
        "junit:target/report/cucumber_junit_report.xml","html:target/cucumber","json:target/cucumber.json"})
public class RunCukesTest {
	
}