package ttt.bootcamp.drivermanager;

import org.openqa.selenium.WebDriver;

import ttt.bootcamp.drivermanager.browserlevelmanagers.ChromeDriverManager;
import ttt.bootcamp.drivermanager.browserlevelmanagers.FirefoxDriverManager;
import ttt.bootcamp.filereader.ConfigReader;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();

	public static void initiateDriver() {
		
		WebDriver driver = null;
		
		String browserType = ConfigReader.getProperty("browser");
		
		
		switch (BrowserTypes.valueOf(browserType.toUpperCase())) {
		case CHROME:
			driver = new ChromeDriverManager().getDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriverManager().getDriver();
			break;

		default:
			throw new IllegalStateException("Unsupported browser type");
		}
		
		driverThreadLocal.set(driver);
	}
	
	public static WebDriver getCurrentDriver() {
		return driverThreadLocal.get();
	}

}
