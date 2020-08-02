package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

	private static WebDriver driver;

	static PropertyReader prop = new PropertyReader();

	private DriverManager() {

	}

	public static WebDriver getDriver() {
		if (driver == null) {
			String browserName = prop.getProperty("browser");

			switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriver_path"));
				driver = new ChromeDriver();
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver", prop.getProperty("geckodriver_path"));
				driver = new FirefoxDriver();
				break;

			case "ie":
				System.setProperty("webdriver.ie.driver", prop.getProperty("iedriver_path"));
				driver = new InternetExplorerDriver();
				break;
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
		

		return driver;

	}
	
	public static void killDriver() {
		if(null != driver) {
			driver.quit();
			driver = null;
		}
	}
	
	//For testing
	public static void main(String[] args) {
		DriverManager.getDriver().get("https://accounttemplate.officesolver.com");
	}

}
