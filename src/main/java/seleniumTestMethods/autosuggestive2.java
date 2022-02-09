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

public class autosuggestive2 extends BaseClass {
	//static WebDriver driver = null;
@Test	
public void autsuggest() throws Exception {

		autosuggestive2 auto = new autosuggestive2();
				
		auto.suggestions();
		//auto.closeBrowser();
		}

@Test
		public void suggestions() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\jzo_0\\eclipse-workspace\\Dropdowns\\chromedriver.exe");
			 //driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("In");
			 driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.DOWN);
			 String text = driver.findElement(By.xpath("//input[@id='autosuggest']")).getText();

				
				System.out.println("Text is"+text);
					Thread.sleep(2000);

					JavascriptExecutor js = (JavascriptExecutor)driver;
				String str = "return document.getElementById(\"autosuggest\").value;";
					String item = (String) js.executeScript(str);
					System.out.println(item);
				int i=0;
			while(!item.equals("India")) {
					i++;
					driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.DOWN);
					Thread.sleep(1000);
					item = (String) js.executeScript(str);
				System.out.println(item);
					if(i>25) {
					break;
					}
					}
					if(i>25) {
					System.out.println("Item not found.");
					fail("Desired item not found.");
					}else{
					System.out.println("Desire item found.");
					}
					driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.TAB);
					//driver.findElement(By.xpath("//button[@title='s2id_autogen16']")).click();
		}
	//				public void closeBrowser() {
//				driver.close();
//			                                  }
		        	}


