package ttt.bootcamp.dataprovider;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import ttt.bootcamp.bo.CredentialsBO;

public class CredentialsProvider {

	@DataProvider
	public Object[][] getLoginCredentials() {

		Faker faker = new Faker();
		int dataSize = 3;

		Object[][] object = new Object[dataSize][1];

		for (int i = 0; i < 3; i++) {
			CredentialsBO creds = new CredentialsBO();
			creds.setUsername(faker.internet().emailAddress());
			creds.setPassword(faker.internet().password());
			
			object[i][0] = creds;
			// 00 -> user1
			// 10 -> user2
			// 20 -> user3
		}

		return object;

	}

}
