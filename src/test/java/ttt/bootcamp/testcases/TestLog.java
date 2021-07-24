package ttt.bootcamp.testcases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {
	
	public static Logger logger = LogManager.getLogger(TestLog.class);
	
	public static void main(String[] args) {
		System.out.println("Print Username:");
		// BasicConfigurator.configure();
		PropertyConfigurator.configure("src/main/resources/log4j.properties");
		logger.info("Informative Message");
		logger.debug("Debug Message");
		logger.warn("Warning message");
		logger.error("Error Message");
		logger.fatal("Fatal Message");
	}
	
	//for RootLogger(Refer - log4j.properties): DEBUG > INFO > WARN > ERROR > FATAL

}
