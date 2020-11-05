package seleniumBasicConcepts;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenBrowser {

	public static void main(String[] args) {
		//Launching Google via Chrome browser
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		 * WebDriver driver= new ChromeDriver(); driver.get("http://www.google.com");
		 * driver.quit();
		 */
		
		//Launching Google via Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\geckodriver.exe");
		//firefox browser version issues being fixed with the below code from line 21 - 29
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setVersion("your firefox version");
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setCapability("marionette", false);
		
		WebDriver fdriver = new FirefoxDriver(capabilities);
		//WebDriver fdriver = new FirefoxDriver();
		fdriver.get("http://www.google.com");
		fdriver.quit();
	}

}
