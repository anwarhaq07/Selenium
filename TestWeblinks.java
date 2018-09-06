package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestWeblinks {
	
	public static void main(String[]args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anwarulhaqmohammed/Desktop/chromedriver");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table"));
		 int i =wb.findElements(By.tagName("tr")).size();
		 System.out.println(i);
		 
		
		 wb.findElements(By.tagName("a")).get(2).click();
	}
	

}
