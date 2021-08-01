package ttt.bootcamp.utilities;

import ttt.bootcamp.drivermanager.DriverFactory;

public class Screenshot {

	public static void capture(String imageName) {
		DriverFactory.getCurrentDriver();
	}
}
