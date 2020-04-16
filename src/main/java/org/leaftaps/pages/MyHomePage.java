package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadsPage clickLeadsTab() {
		driver.findElementByXPath("//a[text()=\"Leads\"]").click();
		return new MyLeadsPage();
	}
	
	
}
