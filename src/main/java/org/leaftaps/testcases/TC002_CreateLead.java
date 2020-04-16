package org.leaftaps.testcases;

import org.leaftaps.api.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_CreateLead extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setExcelPath() {
		excelPath = "./data/TC002_CreateLead.xlsx";
	}
	
	@Test(dataProvider = "excelDate")
	public void createLead(String userName, String password, String companyName, String firstName, String lastName) {
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead().enterCompanyName(companyName).enterFirstName(firstName).enterLastName(lastName).submitCreateLeadButton();
	}
	
}
