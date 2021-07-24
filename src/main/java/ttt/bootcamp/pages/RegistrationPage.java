package ttt.bootcamp.pages;

import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	private WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void open(String url) {
		driver.get(url);
	}

}
