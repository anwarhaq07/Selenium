package Selenium1;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowshandler {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/anwarulhaqmohammed/Desktop/chromedriver");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.tagName("li")).click();
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> itr = s1.iterator();
		
		while(itr.hasNext()) {
			
			String child_window = itr.next();
			
			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
			
			driver.switchTo().window(parent);
			driver.switchTo().window(child_window);
		
			}
		
		
	}

}
