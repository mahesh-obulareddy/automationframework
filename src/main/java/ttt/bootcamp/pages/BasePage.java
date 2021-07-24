package ttt.bootcamp.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ttt.bootcamp.drivermanager.DriverFactory;

public class BasePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private Logger logger = LogManager.getLogger(BasePage.class);
	
	protected BasePage() {
		this.driver = DriverFactory.getCurrentDriver();
		wait = new WebDriverWait(driver, 10);
		js = (JavascriptExecutor) driver;
	}
	
	protected BasePage(int waitTime) {
		this.driver = DriverFactory.getCurrentDriver();
		wait = new WebDriverWait(driver, waitTime);
	}
	
	protected void fillText(By by, String value) {
		WebElement ele = waitForElementToBeDisplayed(by);
		ele.clear();
		ele.sendKeys(value);
	}
	
	protected void openUrl(String url) {
		logger.info("Opened the application using: " + url);
		driver.get(url);
	}
	
	protected void click(By by) {
		waitForElementToBeDisplayed(by).click();
	}
	
	protected String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	protected String getText(By by) {
		return waitForElementToBeDisplayed(by).getText();
	}
	
	private WebElement waitForElementToBeDisplayed(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	protected void waitForPageLoad() {
		js.executeScript("return document.readyState").equals("complate");
	}

}
