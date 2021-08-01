package ttt.bootcamp.drivermanager;

import org.openqa.selenium.WebDriver;

import ttt.bootcamp.drivermanager.browsertypes.ChromeDriverManager;
import ttt.bootcamp.drivermanager.browsertypes.FirefoxDriverManager;
import ttt.bootcamp.filereader.ConfigReader;

public class DriverFactory {
	// Factory Pattern Example

	public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();

	public static void initiateDriver() {

		WebDriver driver = null;

		// get browser from config file
		String browserType = ConfigReader.getProperty("browser");

		switch (BrowserType.valueOf(browserType.toUpperCase())) {
		case CHROME:
			driver = new ChromeDriverManager().getDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriverManager().getDriver();
			break;
		default:
			throw new IllegalStateException("UnSupported Browser Type provided");
		}

		driverThreadLocal.set(driver);
	}

	public static WebDriver getCurrentDriver() {
		return driverThreadLocal.get();
	}

}

// 2 thread in parallel
// 13 and 14
// 13 -> testcase1(P/F) -> testcase3
// thread.put(13, tc1)
// thread.put(13,tc3)
// 14-> testcase2
