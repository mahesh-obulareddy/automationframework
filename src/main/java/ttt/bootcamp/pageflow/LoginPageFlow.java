package ttt.bootcamp.pageflow;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import ttt.bootcamp.bo.CredentialsBO;
import ttt.bootcamp.pages.LoginPage;

public class LoginPageFlow {
	private static Logger logger = LogManager.getLogger(LoginPageFlow.class);

	public static boolean performLogin(CredentialsBO creds) {
		logger.info("Logging in using credentials: " + creds);
		LoginPage loginPage = new LoginPage();
		loginPage.open();
		loginPage.fillUsername(creds.getUsername());
		loginPage.fillPassword(creds.getPassword());
		return loginPage.login();
	}

}
