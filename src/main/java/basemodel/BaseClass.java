package basemodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseClass {

	public static WebDriver driver;
	public static WebDriver driver_firefox;
	public static WebDriver edgedriver;
	public static String BaseUrl;
	public static String colorStreet;
	public static WebDriverWait Ex;
	public static JavascriptExecutor js1;
	@BeforeSuite()
	public void config() {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		//edgedriver = new EdgeDriver();
		//driver_firefox = new FirefoxDriver();
		//driver_firefox = new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
	    //System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		BaseUrl = "http://automationpractice.com/index.php";
		colorStreet= "https://www.colorstreet.com/home/account/register";
	    js1 = (JavascriptExecutor) driver;
		
		
	}
	
	@BeforeTest(groups={"A","B"})
	public void setup() {
              // System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             //driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	      
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Ex =new WebDriverWait(driver, 10);
	}
	
	@AfterSuite(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}
	
}
