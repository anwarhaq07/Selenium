package Selenium1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTest {

	
	public static void main(String[]args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anwarulhaqmohammed/Desktop/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.switchTo().alert().dismiss();
	
		
	}
}
