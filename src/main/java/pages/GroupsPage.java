package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.DriverManager;
import util.ElementActions;

public class GroupsPage extends ElementActions{

	String genericGroupXpath = "//div[@class='es-card__title']/a[text()='GROUP_NAME']";
	
	public GroupPage openGroup(String name) {
		click(By.xpath(genericGroupXpath.replace("GROUP_NAME", name)));
		return PageFactory.initElements(DriverManager.getDriver(), GroupPage.class);
	}
	
	
}
