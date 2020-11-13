package seleniumBasicConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert alertcntrl = driver.switchTo().alert();
		alertcntrl.accept();
		
		WebElement confirmbtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbtn.click();		
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement promptbtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbtn.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Hello");
		promptalert.accept();
		
		
	}

}
