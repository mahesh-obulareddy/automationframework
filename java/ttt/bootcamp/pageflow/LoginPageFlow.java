package ttt.bootcamp.pageflow;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import ttt.bootcamp.bo.CredentialsBO;
import ttt.bootcamp.pages.LoginPage;

public class LoginPageFlow {

	private static Logger logger = LogManager.getLogger(LoginPage.class);

	public static boolean performLogin(CredentialsBO creds) {
		logger.info("Perform Login Operation for User:: " + creds);
		LoginPage login = new LoginPage();
		login.open();
		login.fillUsername(creds.getUsername());
		login.fillPassword(creds.getPassword());
		return login.login();
	}
}
