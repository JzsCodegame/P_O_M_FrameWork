package TestModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseClass {

	public static WebDriver driver;
	public static WebDriver driver_firefox;
	public static String BaseUrl;
	public static String colorStreet;
	
	@BeforeSuite
	public void config() {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		driver = new ChromeDriver();
		driver_firefox = new FirefoxDriver();
		 
		BaseUrl = "http://automationpractice.com/index.php";
		colorStreet= "https://www.colorstreet.com/home/account/register";
		
		
	}
	
	@AfterSuite
	public void teardown() {
		//driver.quit();
	}
	
	
}
