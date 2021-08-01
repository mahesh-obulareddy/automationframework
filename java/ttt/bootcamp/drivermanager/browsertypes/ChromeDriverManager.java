package ttt.bootcamp.drivermanager.browsertypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ttt.bootcamp.drivermanager.DriverManager;

public class ChromeDriverManager implements DriverManager {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

}
