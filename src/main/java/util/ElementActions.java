package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions {
	WebDriver driver = DriverManager.getDriver();
	
	protected boolean isElementPresent(WebElement ele) {
		try {
			return ele.isDisplayed() && ele.isEnabled() ;
		}catch(Exception e) {
			return false;
		}
		
	}
	
	protected void click(WebElement ele) {
		ele.click();
	}
	
	protected void click(By by) {
		driver.findElement(by).click();
	}
}
