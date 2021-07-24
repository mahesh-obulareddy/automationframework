package ttt.bootcamp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ttt.bootcamp.bo.CredentialsBO;
import ttt.bootcamp.dataprovider.CredentialsProvider;
import ttt.bootcamp.pageflow.LoginPageFlow;
import ttt.bootcamp.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test(dataProvider = "getLoginCredentials", dataProviderClass = CredentialsProvider.class)
	public void validDataLogin(CredentialsBO creds) {
		Assert.assertTrue(LoginPageFlow.performLogin(creds), "User is not able to login.");
	}

	@Test
	public void invalidDataLogin() {

		LoginPage loginPage = new LoginPage();
		loginPage.open();
		loginPage.fillUsername("asdiuh@test.com");
		loginPage.fillPassword("password");
		boolean flag = loginPage.login();

		Assert.assertTrue(!flag, "User is able to login using invalid credentials.");

		Assert.assertTrue(
				loginPage.getError().contains("Login was unsuccessful. Please correct the errors and try again."));

	}

}
