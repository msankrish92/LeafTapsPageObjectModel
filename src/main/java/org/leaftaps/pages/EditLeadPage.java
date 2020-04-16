package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage updateDepartment(String company) {
		driver.findElementById("updateLeadForm_departmentName").sendKeys(company);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElementByXPath("//input[@name=\"submitButton\"]").click();
		return new ViewLeadPage();
	}
	
}
