package seleniumTestMethods;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class AutoSuggestive  extends BaseClass {
		//static WebDriver driver = null;
	@Test
public void autosuggest3() throws Exception {

AutoSuggestive auto = new AutoSuggestive();
		
auto.suggestions();
auto.closeBrowser();
}
public void suggestions() throws Exception {
//System.setProperty("webdriver.chrome.driver","C:\\Users\\jzo_0\\eclipse-workspace\\Dropdowns\\chromedriver.exe");
	// driver = new ChromeDriver();
	driver.get("https://global.shopbakerhughes.com/");
	//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Drill");
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.DOWN);
	 String text = driver.findElement(By.xpath("//input[@id='search']")).getText();

		
		System.out.println("Text is"+text);
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = "return document.getElementById(\"search\").value;";
			String item = (String) js.executeScript(str);
			System.out.println(item);
		int i=0;
	while(!item.contains("drilling fluid")){
			i++;
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			item = (String) js.executeScript(str);
		System.out.println(item);
			if(i>15){
			break;
			}
			}
			if(i>15){
			System.out.println("Item not found.");
			fail("Desired item not found.");
			}else{
			System.out.println("Desire item found.");
			}
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//button[@title='Search']")).click();
}
			public void closeBrowser() {
		//driver.close();
	                                  }
         }	

	