package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(xpath = "//div[@id='SW']/div[2]/div[1]/ul/li[6]")
	public WebElement loginButton;

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//section[@class='modalMain ']//button")
	public WebElement signOn;

	public void clickLoginButton() throws InterruptedException{
		Thread.sleep(5000);
		loginButton.click();
	}

	public void signIn(String usernameText, String passwordText) {
		username.sendKeys(usernameText);
		password.sendKeys(passwordText);
		signOn.click();
	}
}
