package TestModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseClass {

	public static WebDriver driver;
	public static String BaseUrl;
	
	
	@BeforeSuite
	public void config() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		 
		BaseUrl = "http://automationpractice.com/index.php";
		
		
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
	
	
}
