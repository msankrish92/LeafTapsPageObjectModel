package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByXPath("//a[text()=\"Create Lead\"]").click();
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLead() {
		driver.findElementByXPath("//a[text()=\"Find Leads\"]").click();
		return new FindLeadsPage();
	}

}
