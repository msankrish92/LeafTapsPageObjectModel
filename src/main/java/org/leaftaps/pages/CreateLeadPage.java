package org.leaftaps.pages;



import org.leaftaps.api.ProjectSpecificMethods;



public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage enterCompanyName(String companyName) {
		driver.findElementByXPath("//span[text()=\"Company Name\"]/following::input").sendKeys(companyName);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElementByXPath("//span[text()=\"First name\"]/following::input").sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lastName) {
		driver.findElementByXPath("//span[text()=\"Last name\"]/following::input").sendKeys(lastName);
		return this;
	}
	
	public ViewLeadPage submitCreateLeadButton() {
		driver.findElementByXPath("//input[@class=\"smallSubmit\"]").click();
		return new ViewLeadPage();
	}

}
