package seleniumBasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobtnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");

		WebElement uncheckedrbtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement checkedrbtn = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		boolean status_unchk = uncheckedrbtn.isSelected();
		boolean status_chk = checkedrbtn.isSelected();
		System.out.println(status_unchk);
		System.out.println(status_chk);

		WebElement age_rbtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		age_rbtn.click();




	}

}
