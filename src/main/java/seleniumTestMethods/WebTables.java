package seleniumTestMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class WebTables extends BaseClass {
@Test
	public void webtab2() {
		// TODO Auto-generated method stub
        
		//  -------Fetch number of rows and columns from Dynamic WebTable
		 
		
		//http://demo.guru99.com/test/web-table-element.php
		//https://www.phptravels.net/
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe"); // Setting system properties of FirefoxDriver
		//WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		//WebDriverWait X = new WebDriverWait(driver, 3);
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		List<WebElement>  col = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        
		System.out.println("No of cols are : " + col.size()); 
        //No.of rows 
        
        
        List<WebElement>  rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")); 
       
        System.out.println("No of rows are : " + rows.size());
        //driver.close();
	
	
	
	
	
	}

}
