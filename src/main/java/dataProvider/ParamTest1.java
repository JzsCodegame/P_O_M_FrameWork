package dataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basemodel.BaseClass;
 
public class ParamTest1 extends BaseClass {
  	
  	
  	@Test(priority = 0)
	
	   @Parameters({"author","searchKey"})
	    public void testParameterWithXML(@Optional("Fahim") String author, @Optional("bangladesh") String searchKey) throws InterruptedException{

	      
	      driver.get("https://google.com");

	        WebElement searchText = driver.findElement(By.name("q"));
	        //Searching text in google text box
	        searchText.sendKeys(author);
	        searchText.clear();
	        searchText.sendKeys(searchKey);

	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        System.out.println("Thread will sleep now");
	        Thread.sleep(3000);
	        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
	        //verifying the value in google search box
	        AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

	}
  	
  	
  	
  	@Test(dataProvider ="ParamTest1", priority = 1,dataProviderClass = DataproviderClassStorage.class)
  	public void search(String keyWord){
        	WebElement txtBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        	  txtBox.sendKeys(keyWord);
        	  Reporter.log("Keyword entered is : " +keyWord);
        	  txtBox.sendKeys(Keys.ENTER);
        	  Reporter.log("Search results are displayed.");
  	}
  	 
  	
  /*	@AfterMethod
  	public void burnDown(){
        	driver.quit();
  	}*/
 
}