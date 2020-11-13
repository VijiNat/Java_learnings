package seleniumBasicConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdwn1 = driver.findElement(By.id("dropdown1"));
		Select slct = new Select(dropdwn1);
		slct.selectByIndex(1);
		//Thread.sleep(3000);
		slct.selectByValue("2");
		//Thread.sleep(3000);
		slct.selectByVisibleText("Loadrunner");
		
		List<WebElement> listOptions = slct.getOptions();
		int listsize=listOptions.size();
		System.out.println("Number of dropdown options: "+listsize);
		
		dropdwn1.sendKeys("UFT/QTP");
		
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select mselect=new Select(multiselect);
		mselect.selectByIndex(1);
		mselect.selectByIndex(2);
		
		
		
	}

}
