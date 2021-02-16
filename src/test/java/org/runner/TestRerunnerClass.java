package org.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="@src/test/resources/failedScenarios.txt", glue="org.stepdef", monochrome=true, dryRun=false, plugin= {"html:target","json:target/rerunReport.jason", "rerun:src\\test\\resources\\failedScenarios.txt"}, tags= {"@smoke"})

public class TestRerunnerClass {

}