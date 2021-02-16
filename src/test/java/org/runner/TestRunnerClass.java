package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdef.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources", glue="org.stepdef", monochrome=true, dryRun=false,tags= {"@smoke"}, plugin= {"json:src\\test\\resources\\Reports\\failReport.json", "rerun:src\\test\\resources\\failedScenarios.txt"})
public class TestRunnerClass {
  @AfterClass
  public static void reportGeneration() {
	  JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\failReport.json");

  }

}
	