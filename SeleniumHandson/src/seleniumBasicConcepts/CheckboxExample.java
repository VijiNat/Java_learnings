package seleniumBasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");

		WebElement chkbox1= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		chkbox1.click();

		WebElement Sel_chkbox2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean selenium_selct =Sel_chkbox2.isSelected();
		System.out.println(selenium_selct);

		WebElement firstelmt = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		WebElement secondelmt = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(firstelmt.isSelected())	
			firstelmt.click();
		if(secondelmt.isSelected())
			secondelmt.click();

	}

}
