package org.leaftaps.testcases;

import org.leaftaps.api.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004_DeleteLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setExcelPath() {
		excelPath = "./data/TC004_DeleteLead.xlsx";
	}
	
	
	@Test(dataProvider = "excelDate")
	public void deleteLead(String userName, String password, String firstName) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickDeleteLead();
	}

}
