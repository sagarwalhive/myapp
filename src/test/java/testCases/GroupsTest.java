package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import util.DriverManager;

public class GroupsTest  extends BaseTest{
	
	@Test
	public void addFolderToGroupsLink() {
		LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(), LoginPage.class);
		loginPage.enterUserName(pr.getProperty("username"));
		loginPage.enterPassword(pr.getProperty("password"));
		loginPage.login();
		HomePage homePage = PageFactory.initElements(DriverManager.getDriver(), HomePage.class);
		Assert.assertTrue(homePage.isSearchBarDisplayed());
		
		
	}

}
