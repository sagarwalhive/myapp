package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.ElementActions;

public class GroupPage extends ElementActions{
	
	@FindBy(xpath="//div[@class='es-profile-header-nav']//span[text()='Files']")
	WebElement files;
	
	public void openFiles() {
		click(files);
	}
	
	@FindBy(xpath="//button[@title='Add Folder']")
	WebElement addFolderBtn;
	
	public void addFolder(String name) {
		click(addFolderBtn);
	}
	
}
