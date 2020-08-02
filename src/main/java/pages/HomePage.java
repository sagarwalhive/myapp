//Put some comments here, class description, why we need it, what is it doing

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.DriverManager;
import util.ElementActions;

public class HomePage extends ElementActions{
	
	@FindBy(xpath="//*[contains(@class, 'footer-submenu')]//*[contains(text(), 'Groups')]")
	WebElement groups;
	
	@FindBy(id="search-box")
	WebElement searchBar;
	
	
	public boolean isSearchBarDisplayed() {
		return isElementPresent(searchBar);
	}
	
	public GroupsPage openGroups() {
		click(groups);
		return PageFactory.initElements(DriverManager.getDriver(), GroupsPage.class);
	}

}
