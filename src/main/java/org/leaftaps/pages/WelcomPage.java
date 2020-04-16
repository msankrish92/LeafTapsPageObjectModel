package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;

public class WelcomPage extends ProjectSpecificMethods {

	public LoginPage clickLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElementByXPath("//div[@id=\"label\"]/a").click();
		return new MyHomePage();
	}
	
}
