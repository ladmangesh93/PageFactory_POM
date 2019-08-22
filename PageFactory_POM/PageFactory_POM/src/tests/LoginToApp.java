package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.LoginPage;

public class LoginToApp extends Base {

	@Test
	public void Login() throws InterruptedException {
		LoginPage locateElments = PageFactory.initElements(driver, LoginPage.class);
		locateElments.clickLoginButton();
		locateElments.signIn("123456789", "qweqweqw");
		Thread.sleep(5000);
	}
}
