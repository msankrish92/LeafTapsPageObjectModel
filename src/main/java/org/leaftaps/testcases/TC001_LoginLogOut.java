package org.leaftaps.testcases;

import org.leaftaps.api.ProjectSpecificMethods;
import org.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class TC001_LoginLogOut extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setExcelPath() {
		excelPath = "./data/TC001_LoginLogOut.xlsx";
	}
	
	
	@Test(dataProvider = "excelDate")
	public void login(String userName, String password) {
		new LoginPage().enterUserName(userName).enterPassword(password).clickLoginButton().clickLogoutButton();
	}
}
