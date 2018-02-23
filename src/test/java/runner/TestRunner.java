package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/tagging.feature" //The path of the feature files
        ,glue={"steps"} //The path of the step definition files
        ,format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"} //to generate diff types of reports
        ,monochrome = true //display the console output in proper readable format
        ,strict = true // It will check if any step is not defined inside step def file
        ,dryRun = false //To check any mapping is proper between feature file & step definition file
        ,tags ={"~@SmokeTest, ~@RegressionTest,~@End2EndTest"}
)

public class TestRunner {
}
