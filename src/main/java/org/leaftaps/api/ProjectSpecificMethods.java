package org.leaftaps.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.leaftaps.utils.ReadExcel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {

	public static RemoteWebDriver driver;
	
	public String excelPath;

	@BeforeClass
	@DataProvider
	public String[][] excelDate() throws IOException {
		ReadExcel data = new ReadExcel();
		return data.readExcel(excelPath);
	}

	@Parameters("Url")
	@BeforeMethod
	public void launchBrowser(String Url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");

		driver = new ChromeDriver();

		driver.get(Url);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

}
