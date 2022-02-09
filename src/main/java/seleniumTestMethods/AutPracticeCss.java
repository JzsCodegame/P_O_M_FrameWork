package seleniumTestMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basemodel.BaseClass;

public class AutPracticeCss extends BaseClass {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver;		   
		   
	    // driver = new ChromeDriver();
	       
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\jzo_0\\eclipse-workspace\\Dropdowns\\chromedriver.exe");
	
	//Select Method
	//Index Method
    //WebDriver  driver;		   
			   
		    // driver = new ChromeDriver();
		       
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\jzo_0\\eclipse-workspace\\SElenium_3\\chromedriver.exe");
			 
			 //WebDriverWait Ex =new WebDriverWait(driver, 5);

			 String url1 = "http://automationpractice.com/index.php";	
			 
			 //String url2 = "http://the-internet.herokuapp.com/";
			 
			 //String url3 = "https://learn.letskodeit.com/p/practice";
			 
			 //String url3 = "https://learn.letskodeit.com/p/practice";
			 
			 driver.manage().window().maximize();

			 driver.get(url1);
			 
			 
			 
			 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

			 
			 
			//Xpath syntax  1     "//tagName[@attribute='value']"  
			//Xpath syntax  2     "//*[@attribute='value']" -  with regular expression
			//Xpath Syntaxt 3  --- full Xpath by using single slash
			//Xpath Syntaxt 4  --- Double Slash start from any point
			//Xpath Syntaxt 5   =  *use multiple attribute   
			 					   //*[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2']]
		    //Xpath Syntaxt 6    -   Syntax using OR :
	    	                         //input[@id='login_1' OR @name='login’]
			//Xpath Syntaxt 7    -   Syntax using AND :
	    	                         //input[@id='login_1' AND @name='login’]*/
			 
			//Xpath 8  =          //tagname[starts-with(@attribute,'starting name of the attribute value')]
			//Xpath 9  =          //*[@id='LastName']//following::input[@type='text']"
			//Xpath 10 =          //input[contains(@Atrbute,'value')]
			 
			 
			 
			//CSS syntax    1      tagName[attribute='value']
			//Css syntaxt   2      tagname#id  
			//Css syntaxt   3      tagname.class[atrb=value]
			//Css syntaxt   4      tagname.class 
			//Css Syntaxt   5      tagname#value.class, # = id
			//Css Syntaxt - 6      tagname[attribute*='sub_string_slashunder']
			//Css Syntaxt - 7      tagname[attribute^='start of String'] 
			//Css Syntaxt - 9      tag[attribute$=suffix of the string]
			 
			 
			 
			 
			 driver.findElement(By.xpath("//*[@class='login']")).click();
			 
			
			 driver.findElement(By.xpath("//*[@class='login']")).getText();
			 
			 
			 
			 driver.findElement(By.xpath("//*[@class='is_required validate account_input form-control']")).click();
			 
			 driver.findElement(By.xpath("//*[@class='is_required validate account_input form-control']")).sendKeys("xaman6@yahoo.ca");
			 
			 
			 
			 
			 
			 
			 driver.findElement(By.cssSelector("button[class='btn btn-default button button-medium exclusive']")).click();
			 
			 driver.getCurrentUrl();
			 
			 
			 
			
			 driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span/input")).click();
			 
			 
			 
			 
			 
			 
			 driver.findElement(By.cssSelector("input#id_gender2")).click();
			
			 Ex.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#id_gender2")));
			 
			 driver.findElement(By.cssSelector("input#id_gender1")).click();
			
			 
			 
			 
			 
			 
			 
			 driver.findElement(By.xpath("//form/div[1]/div[2]/input")).click();
			 
			 driver.findElement(By.xpath("//form/div[1]/div[2]/input")).sendKeys("Joseph");
			 

			
			 
			 
			 
	         driver.findElement(By.xpath("//*[@id='customer_lastname'][@class='is_required validate form-control']")).click();
			 
			 driver.findElement(By.xpath("//*[@id='customer_lastname'][@name='customer_lastname']")).sendKeys("Diaz");
			
			
			
			
			//if the class has multiple mathing node and not the first element from left to right
			
			 
			driver.findElement(By.cssSelector("input.is_required.validate[id=passwd]")).click();
			
			driver.findElement(By.cssSelector("input.is_required.validate[id=passwd]")).sendKeys("bnm890");
			
			
			
			
			WebElement datofBirth_day = driver.findElement(By.cssSelector("select.form-control"));
			
					datofBirth_day.click();
			 
			Select Sinput = new Select(datofBirth_day);
			 Sinput.selectByValue("15");
			 
			 
			
			
			
			driver.findElement(By.cssSelector("select#months.form-control")).click();
			
			WebElement datofBirth_month = driver.findElement(By.cssSelector("select#months.form-control"));
			
			datofBirth_month.click();
	 
	        Select Sinput1 = new Select(datofBirth_month);
	            
	        Sinput1.selectByIndex(5);
			
	        
	       
	        
	        
	        
	        WebElement datofBirth_year = driver.findElement(By.cssSelector("select[id*='years']"));
	        
	        datofBirth_year.click();
	        
	        Select Sinput3 = new Select(datofBirth_year);
	        
	        Sinput3.selectByValue("1997");
	        
	        	 
		 
	}

}
