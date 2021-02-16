package org.pojo;

import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPOJO extends BaseClass{
	
	public LoginPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userId;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b")
	private WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotLink;
	
	@FindBy(xpath="//a[text()='Create a Page']")
    private WebElement createPage;
	
	public WebElement getForgotLink() {
		return forgotLink;
	}

	public WebElement getUserId() {
		return userId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getCreatePage() {
		return createPage;
	}
	
	public void enterUsernamePassword(String username, String password) {
		
        typeText(getUserId(), username);
		typeText(getPassword(), password);
	}
	
	public void buttonClick() {
		btnClick(getBtnLogin());

	}
	
	public void loginAssert() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("invalid username or password", driver.getCurrentUrl().contains("privacy_mutation_token"));
		System.out.println("Please check your login credentials");
	}
	
	public void forgotPw() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(getForgotLink());

	}
	
	public void createNewPage() {
		btnClick(getCreatePage());

	}
}
