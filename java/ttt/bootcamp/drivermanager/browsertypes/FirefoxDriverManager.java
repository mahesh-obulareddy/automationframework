package ttt.bootcamp.drivermanager.browsertypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ttt.bootcamp.drivermanager.DriverManager;

public class FirefoxDriverManager implements DriverManager {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

}
