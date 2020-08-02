package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.DriverManager;
import util.ElementActions;

public class ToDoListPage extends ElementActions{

	@FindBy(xpath="//a[contains(@id,'AddNewTask')]")
	WebElement addToDoList;
	
	@FindBy(xpath="//table[@id='ctl00_PlaceHolderMain_Todolist_DLForToDoList']/tbody/tr[last()]//tr/td[2]/a")
	WebElement lastListNameEle;
	
	@FindBy(xpath="//table[@id='ctl00_PlaceHolderMain_Todolist_DLForToDoList']/tbody/tr[last()]//tr/td[3]")
	WebElement lastListDateEle;
	
	
	
	public void addToDoList() {
		addToDoList.click();
	}
	
	public String getLastListName() {
		return lastListNameEle.getText().trim();
	}
	
	public String getLastListDate() {
		return lastListDateEle.getText().trim();
	}
	
	public void openLastItem() {
		JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", lastListNameEle);
		lastListNameEle.click();
	}
	
	
}
