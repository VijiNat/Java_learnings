package seleniumBasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WkgwithElements_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Niagara Falls"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Niagara Falls")).click();
		driver.findElement(By.linkText("Special Events")).click();
		driver.quit();

	}

}
