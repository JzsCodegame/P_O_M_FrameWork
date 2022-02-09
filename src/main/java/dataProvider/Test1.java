package dataProvider;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import basemodel.BaseClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.DataProvider;

public class Test1 extends BaseClass {
	//WebDriver driver;
	
	  
/*	  @BeforeTest
	public void setup() {
         System.setProperty("webdriver.gecko.driver","geckodriver.exe");
      //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  //driver = new ChromeDriver();
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
	}
	  */
	 
	   @Test(dataProvider="Test1", priority = 0,dataProviderClass = DataproviderClassStorage.class)
	    public void testMethod(String author,String searchKey2) throws InterruptedException{
	    {
	    	driver.get("https://google.com");
	        WebElement searchText = driver.findElement(By.name("q"));
	        //search value in google searchbox
	        searchText.sendKeys(searchKey2);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey2);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey2);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        AssertJUnit.assertTrue(testValue.equalsIgnoreCase(searchKey2));
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey2));
	   }
	   }
}