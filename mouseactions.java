package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/anwarulhaqmohammed/Desktop/chromedriver");
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.weebly.com/app-center/tabs");
		Actions a1 = new Actions(driver);
		WebElement wb = driver.findElement(By.tagName("a"));
		WebElement ku = driver.findElement(By.name("q"));
		a1.doubleClick(wb).build().perform();
		//a1.clickAndHold(ku).build().perform();
		a1.keyUp(ku, Keys.SHIFT).sendKeys(ku, "anwar").perform();
		
	}

}
