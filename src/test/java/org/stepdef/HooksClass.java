package org.stepdef;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before({"@sanity,@smoke,@regression"})
	public void beforeExecution() {
		chromeBrowser();
		maxWindow();
	}

	@After("@sanity,@smoke,@regression")
	public void afterExecution(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	s.embed(screenshotAs, "image/png");
System.out.println(s.getName()+"Scenario Failed");
		}		
	
			}
}
