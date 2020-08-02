package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.DriverManager;

public class LoginPage {
	WebDriver driver = DriverManager.getDriver();
	
	public LoginPage() {
//		PageFactory.initElements(DriverManager.getDriver(), null);
	}

	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"loginbox\"]/fieldset/div[3]/div[2]/button")
	private WebElement loginBtn;
	
	public void enterUserName(String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void login() {
		loginBtn.click();
	}
	
	public boolean isLoggedIn() {
		try {
			return !(loginBtn.isEnabled() && loginBtn.isDisplayed());
		}catch(Exception e) {
			return true;
		}
		
	}
}
