package org.pojo;

import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class ForgotPasswordPOJO extends BaseClass{

	public ForgotPasswordPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identify_email")
	private WebElement enterMail;
	
	@FindBy(id="did_submit")
	private WebElement submitBtn;
	
	@FindBy(xpath="//div[text()='No search results']")
    private WebElement noSearchResult;	
	
	public WebElement getEnterMail() {
		return enterMail;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getNoSearchResult() {
		return noSearchResult;
	}
	
	public void getMail(String email) throws InterruptedException {
	    Thread.sleep(3000);	
		typeText(getEnterMail(),email);
	}
     public void submitButton() {
	btnClick(getSubmitBtn());
    }
     
     public void forgotAssert() throws InterruptedException {
    	
 		Thread.sleep(3000);
 		Assert.assertTrue("Test case passed", getNoSearchResult().isDisplayed());
 		System.out.println("Please enter your mobile number");

	}
	
}
