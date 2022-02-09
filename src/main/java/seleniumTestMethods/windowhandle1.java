package seleniumTestMethods;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class windowhandle1 extends BaseClass{

	@Test
	public void window() throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver;		   
		   
	     driver = new ChromeDriver();
	       
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\jzo_0\\eclipse-workspace\\HandleWindows\\chromedriver");	

		 String url1 = "file:///C:/Users/jzo_0/Downloads/MultiWindows.html";	
		 
		 driver.get(url1);
		 
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 
		 WebDriverWait Ex =new WebDriverWait(driver, 5);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[@id='nwindow1']")).click();
		 
		 //driver.manage().window().maximize();
		 
		 String parent = driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            
		 		Set<String> set1 = driver.getWindowHandles();		
	        
		 		Iterator<String> iterator1 = set1.iterator();		
	        		
	        while(iterator1.hasNext())	 {		
	       
	       		
	            String child_window = iterator1.next();		
	            		
	            
	            if(!parent.equals(child_window))		
	           
	            {    		
	                 
	                    // Switching to Child window
	           driver.switchTo().window(child_window);
	           Thread.sleep(5000);
	             
	          	
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(parent);  		
	            
	            
	            
	         driver.findElement(By.xpath("//button[@id='nwindow1']")).click();
	         
	         
	            
	         //IT Online Courses with Certificates | IT Online Training - H2kinfosy
	           while(iterator1.hasNext())			
	     	       
		        {			
		            String child_window1 = iterator1.next();		
		            
		            if(!parent.equals(child_window1)) { 		
		           
		               		
		                 
		                    // Switching to Child window
		           driver.switchTo().window(child_window1);	                                                                                                           
		           
		           Ex.until(ExpectedConditions.urlContains("https://www.h2kinfosys.com/"));
		                                                                                                 }
		                        //driver.close();				
		        
		        
		        
		        }		
		        // Switching to Parent window i.e Main Window.
		            driver.switchTo().window(parent);  
		            
	          
	    }
			
	} 



