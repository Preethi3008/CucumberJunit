package org.pojo;

public class PageObjectManager {

	private PageObjectManager() {
	}
	private static PageObjectManager pageObjectManager;
	private LoginPOJO loginPojo;
	private ForgotPasswordPOJO forgotPasswordPojo;
	private CreateAPagePOJO createAPagePojo;
	
	public static PageObjectManager getPageObjectManager() {
		return (pageObjectManager==null)?pageObjectManager= new PageObjectManager():pageObjectManager;
	}
	public LoginPOJO getLoginPojo() {
		return (loginPojo==null)?loginPojo= new LoginPOJO():loginPojo;
	}
	public ForgotPasswordPOJO getForgotPasswordPojo() {
		return (forgotPasswordPojo==null)?forgotPasswordPojo = new ForgotPasswordPOJO():forgotPasswordPojo;
	}
	public CreateAPagePOJO getCreateAPagePojo() {
		return (createAPagePojo==null)?createAPagePojo = new CreateAPagePOJO():createAPagePojo;
	}
	
}
