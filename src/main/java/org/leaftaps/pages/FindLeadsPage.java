package org.leaftaps.pages;

import org.leaftaps.api.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindLeadsPage extends ProjectSpecificMethods{

	public FindLeadsPage enterFirstName(String firstName) {
		driver.findElementByXPath("(//input[@name=\"firstName\"])[position()=\"3\"]").sendKeys(firstName);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() {
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		return this;
	}
	
	public ViewLeadPage clickFirstLead() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,\"x-grid3-cell-inner\")]/a")));
		driver.findElementByXPath("//div[contains(@class,\"x-grid3-cell-inner\")]/a").click();
		return new ViewLeadPage();
	}
	
}
