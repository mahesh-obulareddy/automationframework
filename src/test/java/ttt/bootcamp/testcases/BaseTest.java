package ttt.bootcamp.testcases;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ttt.bootcamp.drivermanager.DriverFactory;
import ttt.bootcamp.filereader.ConfigReader;

public class BaseTest {

	@BeforeSuite
	public void getPrerequisites() {
		new ConfigReader();

		PropertyConfigurator.configure("src/main/resources/log4j.properties");
	}

	@BeforeMethod
	public void openBrowser() {
		DriverFactory.initiateDriver();
		DriverFactory.getCurrentDriver();
	}

	@AfterMethod
	public void closeBrowser() {
		DriverFactory.getCurrentDriver().quit();
	}

}
