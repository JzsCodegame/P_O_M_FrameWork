package seleniumTestMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basemodel.BaseClass;

public class tooltip extends BaseClass {
	
	
	public void tooltip1() throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//http://demo.guru99.com/test/tooltip.html
		//https://demoqa.com/automation-practice-form
		//http://automationpractice.com/index.php
		//http://webdriveruniversity.com/index.html
		//https://www.phptravels.net/
		
		/*System.setProperty("webdriver.gecko.driver","geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		WebDriverWait X = new WebDriverWait(driver, 3);
		driver.manage().window().maximize();*/
		
		
		driver.get("https://www.phptravels.net/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement company = driver.findElement(By.xpath("//a[@href='company']"));
		
		
		Actions perform = new Actions(driver);
		
		
		
		WebElement contact = driver.findElement(By.xpath(".//a[@href='https://www.phptravels.net/about-us']"));
		Thread.sleep(2000);
		perform.moveToElement(company).build().perform();
		
		Ex.until(ExpectedConditions.visibilityOf(contact));
		perform.moveToElement(contact).click().build().perform();
		
		
        String expectedTooltip = "Contact";	
        		
        

         //get the value of the "title" attribute of the contact icon		
        String actualTooltip = contact.getAttribute("href");	
        
        //Assert the tooltip's value is as expected 		
       System.out.println("Actual Title of Tool Tip"+actualTooltip);							
       if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        //driver.close();	
	}
}
