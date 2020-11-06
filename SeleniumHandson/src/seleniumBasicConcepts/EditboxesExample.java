package seleniumBasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditboxesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		WebElement Emailbox = driver.findElement(By.id("email"));
		Emailbox.sendKeys("abc@gmail.com");

		WebElement Textbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		Textbox.sendKeys("Text"+Keys.TAB);
		
		WebElement Editbox = driver.findElement(By.name("username"));
		String Edit_text	= Editbox.getAttribute("value");
		System.out.println("The text in the edit box is: "+Edit_text);
		
		WebElement clearText = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearText.clear();
		
		WebElement Enablestat= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		Boolean edit_status = Enablestat.isEnabled();
		System.out.println("The status of the edit box is: "+edit_status);
	}

}
