package ttt.bootcamp.drivermanager.browserlevelmanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ttt.bootcamp.drivermanager.IDriverManager;

public class ChromeDriverManager implements IDriverManager {

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

}
