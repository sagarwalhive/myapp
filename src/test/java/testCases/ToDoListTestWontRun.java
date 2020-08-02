package testCases;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.ToDoListDetailsPage;
import pages.ToDoListPage;
import util.CalenderUtil;
import util.DriverManager;
import util.RandomGeneration;

public class ToDoListTestWontRun extends BaseTest{
	@Test
	public void addToDoList() throws InterruptedException {
		
		/*
		 * LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		 * LoginPage.class); loginPage.enterUserName(pr.getProperty("username"));
		 * loginPage.enterPassword(pr.getProperty("password")); loginPage.login();
		 * Thread.sleep(3000); HomePage homePage =
		 * PageFactory.initElements(DriverManager.getDriver(), HomePage.class);
		 * Assert.assertTrue(homePage.isSearchBarDisplayed()); homePage.openToDoList();
		 * // Thread.sleep(3000); ToDoListPage todoListPage =
		 * PageFactory.initElements(DriverManager.getDriver(), ToDoListPage.class);
		 * todoListPage.addToDoList(); // Thread.sleep(3000); ToDoListDetailsPage
		 * toDoListDetailsPage = PageFactory.initElements(DriverManager.getDriver(),
		 * ToDoListDetailsPage.class); Random rand = new Random(); String title =
		 * RandomGeneration.getRandomName("ToDoTitle");
		 * toDoListDetailsPage.enterTitle(title);
		 * toDoListDetailsPage.enterNotes("Notes"+rand.nextInt(1000));
		 * toDoListDetailsPage.save(); // Thread.sleep(3000);
		 * 
		 * Assert.assertEquals(todoListPage.getLastListName(), title);
		 */	
		
		
		
	}
	
	@Test
	public void addToDoListWithOutDate() {
		/*
		 * LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		 * LoginPage.class); loginPage.enterUserName(pr.getProperty("username"));
		 * loginPage.enterPassword(pr.getProperty("password")); loginPage.login();
		 * 
		 * HomePage homePage = PageFactory.initElements(DriverManager.getDriver(),
		 * HomePage.class); Assert.assertTrue(homePage.isSearchBarDisplayed());
		 * homePage.openToDoList(); ToDoListPage todoListPage =
		 * PageFactory.initElements(DriverManager.getDriver(), ToDoListPage.class);
		 * todoListPage.addToDoList(); ToDoListDetailsPage toDoListDetailsPage =
		 * PageFactory.initElements(DriverManager.getDriver(),
		 * ToDoListDetailsPage.class); String title =
		 * RandomGeneration.getRandomName("ToDoTitle");
		 * toDoListDetailsPage.enterTitle(title); String notes =
		 * RandomGeneration.getRandomName("Notes");
		 * toDoListDetailsPage.enterNotes(notes);
		 * toDoListDetailsPage.setListDateByTxtBox(""); toDoListDetailsPage.save(); //
		 * Thread.sleep(3000);
		 * 
		 * Assert.assertEquals(todoListPage.getLastListName(), title);
		 * Assert.assertEquals(todoListPage.getLastListDate(),
		 * CalenderUtil.getTodayDate()); todoListPage.openLastItem();
		 * Assert.assertEquals(toDoListDetailsPage.getNotes(), notes);
		 */
	}
	
	@Test
	public void addToDoListAndModify() {
		
		/*
		 * LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(),
		 * LoginPage.class); loginPage.enterUserName(pr.getProperty("username"));
		 * loginPage.enterPassword(pr.getProperty("password")); loginPage.login();
		 * HomePage homePage = PageFactory.initElements(DriverManager.getDriver(),
		 * HomePage.class); Assert.assertTrue(homePage.isSearchBarDisplayed());
		 * homePage.openToDoList(); ToDoListPage todoListPage =
		 * PageFactory.initElements(DriverManager.getDriver(), ToDoListPage.class);
		 * todoListPage.addToDoList(); ToDoListDetailsPage toDoListDetailsPage =
		 * PageFactory.initElements(DriverManager.getDriver(),
		 * ToDoListDetailsPage.class); String title =
		 * RandomGeneration.getRandomName("ToDoTitle");
		 * toDoListDetailsPage.enterTitle(title); String notes =
		 * RandomGeneration.getRandomName("Notes");
		 * toDoListDetailsPage.enterNotes(notes);
		 * toDoListDetailsPage.setListDateByTxtBox(""); toDoListDetailsPage.save(); //
		 * Thread.sleep(3000);
		 * 
		 * Assert.assertEquals(todoListPage.getLastListName(), title);
		 * Assert.assertEquals(todoListPage.getLastListDate(),
		 * CalenderUtil.getTodayDate()); todoListPage.openLastItem();
		 * Assert.assertEquals(toDoListDetailsPage.getNotes(), notes);
		 * 
		 * toDoListDetailsPage.edit();
		 * 
		 * String newtitle = RandomGeneration.getRandomName("ModifiedTitle");
		 * toDoListDetailsPage.enterTitle(newtitle); String newnotes =
		 * RandomGeneration.getRandomName("ModifiedNotes");
		 * toDoListDetailsPage.enterNotes(newnotes); //
		 * toDoListDetailsPage.setListDateByTxtBox(""); toDoListDetailsPage.save();
		 * Assert.assertEquals(todoListPage.getLastListName(), newtitle); //
		 * Assert.assertEquals(todoListPage.getLastListDate(),
		 * CalenderUtil.getTodayDate()); todoListPage.openLastItem();
		 * Assert.assertEquals(toDoListDetailsPage.getNotes(), newnotes);
		 */
	}
	/*
	@Test
	public void addToDoListAndAddNewItem() {
		LoginPage loginPage = PageFactory.initElements(DriverManager.getDriver(), LoginPage.class);
		loginPage.enterUserName(pr.getProperty("username"));
		loginPage.enterPassword(pr.getProperty("password"));
		loginPage.login();
		HomePage homePage = PageFactory.initElements(DriverManager.getDriver(), HomePage.class);
		Assert.assertTrue(homePage.isWelcomeTextDisplayed());
		homePage.openToDoList();
		ToDoListPage todoListPage =  PageFactory.initElements(DriverManager.getDriver(), ToDoListPage.class);
		todoListPage.addToDoList();
		ToDoListDetailsPage toDoListDetailsPage = PageFactory.initElements(DriverManager.getDriver(), ToDoListDetailsPage.class);
		String title = RandomGeneration.getRandomName("ToDoTitle");
		toDoListDetailsPage.enterTitle(title);
		String notes = RandomGeneration.getRandomName("Notes");
		toDoListDetailsPage.enterNotes(notes);
		toDoListDetailsPage.setListDateByTxtBox("");
		toDoListDetailsPage.save();
//		Thread.sleep(3000);
		
		Assert.assertEquals(todoListPage.getLastListName(), title);
		Assert.assertEquals(todoListPage.getLastListDate(), CalenderUtil.getTodayDate());
		todoListPage.openLastItem();
		Assert.assertEquals(toDoListDetailsPage.getNotes(), notes);
		
		toDoListDetailsPage.edit();
		
		String newtitle = RandomGeneration.getRandomName("ModifiedTitle");
		toDoListDetailsPage.enterTitle(newtitle);
		String newnotes = RandomGeneration.getRandomName("ModifiedNotes");
		toDoListDetailsPage.enterNotes(newnotes);
//		toDoListDetailsPage.setListDateByTxtBox("");
		toDoListDetailsPage.save();
		Assert.assertEquals(todoListPage.getLastListName(), newtitle);
//		Assert.assertEquals(todoListPage.getLastListDate(), CalenderUtil.getTodayDate());
		todoListPage.openLastItem();
		Assert.assertEquals(toDoListDetailsPage.getNotes(), newnotes);
	} */
}
