package seleniumBasicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VICVIJ\\eclipse-workspace\\Driver files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement btn_position = driver.findElement(By.id("position"));
		Point xyPoint = btn_position.getLocation();
		int xPosition = xyPoint.getX();
		int yPosition = xyPoint.getY();
		System.out.println("The x value of the button is: "+xPosition+ " and y value of the button is "+yPosition);
		
		WebElement btn_color=driver.findElement(By.id("color"));
		String color = btn_color.getCssValue("background-color");
		System.out.println("Button color is: "+color);
	
		WebElement btn_size=driver.findElement(By.id("size"));
		int btn_height = btn_size.getSize().getHeight();
		int btn_width = btn_size.getSize().getWidth();
		System.out.println("Height of the button is "+btn_height+" and the Width of the button is: "+btn_width);
		
		WebElement btn_home = driver.findElement(By.id("home"));
		btn_home.click();
	}

}
