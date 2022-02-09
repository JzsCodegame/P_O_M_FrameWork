package seleniumTestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class Wbtables_rows_tables extends BaseClass {

	
	@Test
	public void webtab2() {
		// TODO Auto-generated method stub
		
		//-------Fetch cell value of a particular row and column of the Dynamic Table
		
		
		/*System.setProperty("webdriver.gecko.driver","geckodriver.exe"); // Setting system properties of FirefoxDriver
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		WebDriverWait X = new WebDriverWait(driver, 3);
		driver.manage().window().maximize();*/
		
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table.Row index doesn't change
		 
		WebElement tableRow = baseTable.findElement(By.xpath("//table[@class='dataTable']/descendant::tr[5]"));
        
		 String rowtext = tableRow.getText();
		 
        System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data doesn't change
		    WebElement cellIneed = tableRow.findElement(By.xpath("//table[@class='dataTable']/descendant::tr[5]/td[2]"));
		    
		    String valueIneed = cellIneed.getText();
		    
		    System.out.println("Cell value is : " + valueIneed); 
	}

}
