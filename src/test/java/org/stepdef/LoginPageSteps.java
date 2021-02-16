package org.stepdef;

import java.util.List;
import org.pojo.*;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.CreateAPagePOJO;
import org.pojo.ForgotPasswordPOJO;
import org.pojo.LoginPOJO;
import org.pojo.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPageSteps extends BaseClass {

	  

	@Given("The user has to launch browser and hit facebook url")
	public void the_user_has_to_launch_browser_and_hit_facebook_url() {
		launchurl("https://www.facebook.com/");
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dt) {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		  LoginPOJO loginPojo = pageObjectManager.getLoginPojo();
		loginPojo.enterUsernamePassword("ghjkl@qee32.dld", "sdsdd2323rs");
	}

	@When("click the login button")
	public void click_the_login_button() {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		  LoginPOJO loginPojo = pageObjectManager.getLoginPojo();
		  loginPojo.buttonClick();
		
	}

	@Then("user should not be taken to the home page")
	public void user_should_not_be_taken_to_the_home_page() throws InterruptedException {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		  LoginPOJO loginPojo = pageObjectManager.getLoginPojo();
		  loginPojo.loginAssert();
	}

	@When("user has to click the forgotten password link")
	public void user_has_to_click_the_forgotten_password_link() throws InterruptedException {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		  LoginPOJO loginPojo = pageObjectManager.getLoginPojo();
		  loginPojo.forgotPw();
		
	}

	@When("user has to enter phone or email")
	public void user_has_to_enter_phone_or_email(io.cucumber.datatable.DataTable dt) throws InterruptedException {
		Map<String, String> m = dt.asMap(String.class, String.class);
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		ForgotPasswordPOJO forgotPasswordPojo = pageObjectManager.getForgotPasswordPojo();
		forgotPasswordPojo.getMail(m.get("email"));
	}

	@When("user has to click search button")
	public void user_has_to_click_search_button() {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		ForgotPasswordPOJO forgotPasswordPojo = pageObjectManager.getForgotPasswordPojo();
		forgotPasswordPojo.submitButton();
		
	}

	@Then("user has to be redirected to OTP page")
	public void user_has_to_be_redirected_to_OTP_page() throws InterruptedException {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		ForgotPasswordPOJO forgotPasswordPojo = pageObjectManager.getForgotPasswordPojo();
		forgotPasswordPojo.forgotAssert();
	}


	@When("The user has to click the create a page link in facebook")
	public void the_user_has_to_click_the_create_a_page_link_in_facebook() {
	
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		  LoginPOJO loginPojo = pageObjectManager.getLoginPojo();	
		  loginPojo.createNewPage();
	}

	@When("click business or brand link")
	public void click_business_or_brand_link() {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		CreateAPagePOJO createAPagePojo = pageObjectManager.getCreateAPagePojo();
		createAPagePojo.businessLink();
	}

	@Then("The user must be taken to the login page")
	public void the_user_must_be_taken_to_the_login_page() throws InterruptedException {
		PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManager();
		CreateAPagePOJO createAPagePojo = pageObjectManager.getCreateAPagePojo();
		createAPagePojo.createPageAssert();
	}

}
