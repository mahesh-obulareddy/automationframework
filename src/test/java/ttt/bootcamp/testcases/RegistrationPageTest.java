package ttt.bootcamp.testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import ttt.bootcamp.pages.LoginPage;

public class RegistrationPageTest {
	
	Logger logger = LogManager.getLogger(RegistrationPageTest.class);

	@Test
	public void registerNewStudent() {
		LoginPage loginPage = new LoginPage();
		loginPage.open();
		loginPage.fillUsername("asdiuh@test.com");
		loginPage.fillPassword("password");
		boolean flag = loginPage.login();

		Assert.assertTrue(flag, "User is not able to login.");
	}

}
