package ttt.bootcamp.drivermanager.browserlevelmanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ttt.bootcamp.drivermanager.IDriverManager;

public class FirefoxDriverManager implements IDriverManager {

	public WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

}
