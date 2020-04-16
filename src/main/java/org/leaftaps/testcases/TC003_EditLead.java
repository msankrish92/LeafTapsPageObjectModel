package org.leaftaps.testcases;

import org.leaftaps.api.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_EditLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setExcelPath() {
		excelPath = "./data/TC003_EditLead.xlsx";
	}
	
	
	@Test(dataProvider = "excelDate")
	public void editLead(String userName, String password, String firstName, String company) {
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
		.clickEditLeadButton()
		.updateDepartment(company)
		.clickUpdateButton();
	}
	
}
