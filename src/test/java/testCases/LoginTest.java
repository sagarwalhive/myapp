package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import util.DriverManager;

public class LoginTest extends BaseTest{
	
	//This is positive login scenario
	@Test
	public void validlogin() {
		
		// Lets display which test we are running on the browser
		//LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(), LoginPage.class);
//		System.out.println(pr.getProperty("username"));
		  LoginPage loginPage = new LoginPage();
		
		  loginPage.enterUserName(pr.getProperty("username"));
		  loginPage.enterPassword(pr.getProperty("password"));
		  Reporter.log("Username is "+pr.getProperty("username"));
		  Reporter.log("Password is "+pr.getProperty("password")); 
		  loginPage.login();
		  HomePage homePage = PageFactory.initElements(DriverManager.getDriver(),HomePage.class); 
		  Assert.assertTrue(homePage.isSearchBarDisplayed());
		 
		/*try {
		//	Thread.sleep(2000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		*/
	}
	
	@Test
	public void invalidloginWithWrongUsername() {
		
		  LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		  LoginPage.class); loginPage.enterUserName("invaliduser");
		  loginPage.enterPassword(pr.getProperty("password"));
		  Reporter.log("Username is invaliduser");
		  Reporter.log("Password is "+pr.getProperty("password")); 
		  loginPage.login();
		
		  HomePage homePage = PageFactory.initElements(DriverManager.getDriver(), HomePage.class);
		  Assert.assertFalse(homePage.isSearchBarDisplayed());
		 //		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	@Test
	public void invalidloginWithWrongPassword() {
		
		  LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		  LoginPage.class); loginPage.enterUserName(pr.getProperty("username"));
		  loginPage.enterPassword("fqwefsvsdf");
		  
		  Reporter.log("Username is "+pr.getProperty("username"));
		  Reporter.log("Password is fqwefsvsdf"); 
		  loginPage.login();
		  
		  HomePage homePage = PageFactory.initElements(DriverManager.getDriver(),HomePage.class);
		  Assert.assertFalse(homePage.isSearchBarDisplayed());
		 		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	@Test
	public void invalidloginWithWrongUsernameAndPasswrod() {
		
		  LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		  LoginPage.class); loginPage.enterUserName("invaliduser");
		  loginPage.enterPassword("pasdd@@");
		  
		  Reporter.log("Username is invaliduser"); Reporter.log("Password is pasdd@@");
		  loginPage.login();
		  
		  HomePage homePage = PageFactory.initElements(DriverManager.getDriver(), HomePage.class);
		  Assert.assertFalse(homePage.isSearchBarDisplayed());
		 		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
