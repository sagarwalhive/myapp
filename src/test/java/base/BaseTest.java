package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import pages.LoginPage;
import util.DriverManager;
import util.PropertyReader;


public class BaseTest {
	public PropertyReader pr = new PropertyReader();
	
	
	public void startup() {
		DriverManager.getDriver().get(pr.getProperty("url"));
	
		/*
		 * LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		 * LoginPage.class); loginPage.enterUserName(pr.getProperty("username"));
		 * loginPage.enterPassword(pr.getProperty("password")); loginPage.login();
		 */
};
	
	
	public void cleanup() {
		DriverManager.killDriver();
	}

}
