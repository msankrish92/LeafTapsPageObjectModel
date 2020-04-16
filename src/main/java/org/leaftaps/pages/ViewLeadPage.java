package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public EditLeadPage clickEditLeadButton() {
		driver.findElementByXPath("//a[text()=\"Edit\"]").click();
		return new EditLeadPage();
	}
	
	public MyLeadsPage clickDeleteLead() {
		driver.findElementByXPath("//a[text()=\"Delete\"]").click();
		return new MyLeadsPage();
	}
	
	

}
