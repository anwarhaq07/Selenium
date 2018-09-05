package Selenium1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Seleniumtests {

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","/Users/anwarulhaqmohammed/Downloads/geckodriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/anwarulhaqmohammed/Downloads/chromedriver");
		 
		WebDriver driver;
		
		 driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qwer");
		driver.findElement(By.id("u_0_2")).click();
		
		
	}
}	
	


