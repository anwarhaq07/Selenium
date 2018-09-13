package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class provider {
	
	WebDriver driver ;
	@BeforeTest
	public void setup(){
		
		System.setProperty("webdriver.gecko.driver","/Users/anwarulhaqmohammed/Downloads/geckodriver");
		FirefoxDriver ff = new FirefoxDriver();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}
	@Test(dataProvider = "SearchProvider")
	public void testMethod(String author, String searchKey) {
		
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);
		
		String testValue = searchText.getAttribute("value");
		searchText.clear();
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
		
	}
	
	@DataProvider(name = "SearchProvider")
	public Object[][] getDataFromDataprovider() {
		
		return new Object[][] {
		
	            { "Guru99", "India" },

	            { "Krishna", "UK" },

	            { "Bhupesh", "USA" }

		};
		
		
	}

}
