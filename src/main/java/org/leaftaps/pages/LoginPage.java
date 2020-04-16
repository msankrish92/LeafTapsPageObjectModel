package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUserName(String userName) {
		driver.findElementById("username").sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public WelcomPage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new WelcomPage();
	}
	
}
