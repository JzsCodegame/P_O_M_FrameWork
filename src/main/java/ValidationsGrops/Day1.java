package ValidationsGrops;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Day1 {

	public String baseUrl = "http://automationpractice.com/index.php";
    String driverPath = "C:\\Users\\jzo_0\\eclipse-workspace1\\POM_Automation_Selenium\\chromedriver.exe";
    String keyPath = "webdriver.chrome.driver";
    public WebDriver driver; 

    @BeforeTest
public void setup() {
    System.out.println("launching browser"); 
    System.setProperty(keyPath, driverPath);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
 }
    @Test(priority = 0)
    public void getUrl() {
    	 driver.manage().window().maximize();
    	 driver.get(baseUrl);
    	 
    }
    @Test(priority = 0)
    public void verifyHomepageTitle() {
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        AssertJUnit.assertEquals(actualTitle, expectedTitle);
    }
    @Test(priority = 1)

    public void verifySigninPage() {
    	driver.findElement(By.xpath("//*[@class='login']")).click();
    	String expectedURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        String actualURL = driver.getCurrentUrl();
        AssertJUnit.assertEquals(actualURL, expectedURL);
    }
    @Test(priority = 2)
    public void verifySignupForm() {
        String expectedForm = "create-account_form";
        String actualForm = driver.findElement(By.cssSelector("#create-account_form")).getAttribute("id");
        AssertJUnit.assertEquals(actualForm, expectedForm);
        
    }

    @Test(priority = 3)
    public void verifyAuthentificForm() {
    	String expectedForm = "login_form";
        String actualForm = driver.findElement(By.cssSelector("#login_form")).getAttribute("id");
        AssertJUnit.assertEquals(actualForm, expectedForm);
    }


    @AfterTest
    public void closeBrowser(){
        driver.close();
    }

}