package ttt.bootcamp.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import ttt.bootcamp.filereader.ConfigReader;

public class LoginPage extends BasePage {
	Logger logger = LogManager.getLogger(LoginPage.class);
	private String pageURL = ConfigReader.getProperty("baseUrl") + "/login";

	// page locators
	By email_Textbox = By.id("Email");
	By password_Textbox = By.id("Password");
	By logInButton = By.xpath("//button[text()='Log in']");
	By errorMessageText = By.cssSelector(".validation-summary-errors");

	public void open() {
		logger.debug("Opening the Login page");
		openUrl(pageURL);
	}

	public void fillUsername(String username) {
		logger.debug("Providing username as: " + username);
		fillText(email_Textbox, username);
	}

	public void fillPassword(String password) {
		logger.debug("Providing password as: " + password);
		fillText(password_Textbox, password);
	}

	public boolean login() {
		click(logInButton);
		waitForPageLoad();
		return getCurrentURL().contains("/home");
	}

	public String getError() {
		return getText(errorMessageText);
	}
}
