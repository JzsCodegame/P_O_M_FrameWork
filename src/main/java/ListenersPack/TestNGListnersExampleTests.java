package ListenersPack;


	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;

import basemodel.BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.firefox.FirefoxDriver;

	import org.testng.Assert;

	import org.testng.annotations.BeforeClass;

	import org.testng.annotations.Test;

	public class TestNGListnersExampleTests extends BaseClass{

	            //WebDriver driver;

	         String baseURL = "https://www.gmail.com/";

	          //  @BeforeClass

	        //    public void setup() {

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\jzo_0\\eclipse-workspace\\01.Testng\\chromedriver.exe");

	          //              driver = new ChromeDriver();

	             //           driver.manage().window().maximize();

	            //}

@Test(priority=1)

	            public void verifycurrentUrl() {

	                        driver.navigate().to(baseURL);

	                        String ActualResult=driver.getCurrentUrl();

	                        System.out.println(ActualResult);

	                        String ExceptedResult = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

	                        AssertJUnit.assertEquals(ActualResult, ExceptedResult);

	            }

@Test(priority=2)
public void VerifyCurrentURl() throws InterruptedException{
driver.navigate().to(baseURL);
Thread.sleep(10000);
driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(5000);
WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")); //Wrong Xpath.
String ActualResult = element.getText();       ///html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button..... Correct Xpath.
AssertJUnit.assertEquals(ActualResult, "Forgot email?");

	            }         

	}
