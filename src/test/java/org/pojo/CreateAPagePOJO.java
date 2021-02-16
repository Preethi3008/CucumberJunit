package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class CreateAPagePOJO extends  BaseClass {

	public CreateAPagePOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[text()='Get Started'])[1]")
private WebElement getStartedBrand;	
	@FindBy(xpath="(//div[text()='You must log in to continue.'])[2]")
	private WebElement loginToCntnue;
	public WebElement getGetStartedBrand() {
		return getStartedBrand;
	}
	public WebElement getLoginToCntnue() {
		return loginToCntnue;
	}
	
	public void businessLink() {
		btnClick(getGetStartedBrand());

	}
	public void createPageAssert() throws InterruptedException {
		Thread.sleep(5000);
		
		Assert.assertTrue("Assert passed", getLoginToCntnue().isDisplayed());
		System.out.println("Please Login to continue");

	}
}
