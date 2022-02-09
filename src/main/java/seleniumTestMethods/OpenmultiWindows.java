package seleniumTestMethods;


import java.util.ArrayList;

import org.testng.annotations.Test;

import basemodel.BaseClass;

public class OpenmultiWindows extends BaseClass {

	
	@Test
	public void multiwindow() throws InterruptedException {
			
		//WebDriver driver;
		        
				//driver = new ChromeDriver();
			              
					 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\jzo_0\\eclipse-workspace\\HandleWindows\\chromedriver.exe");
	
					 //Execution of the Command  				//Location of the file\\
					 

						//JavascriptExecutor js = (JavascriptExecutor) driver;

						driver.get("https://www.rahulshettyacademy.com/AutomationPractice/"); Thread.sleep(1000L);// index numer 0
						js1.executeScript("window.open('http://www.practiceselenium.com/')"); Thread.sleep(1000L);//  2
						js1.executeScript("window.open('http://spicejet.com/')"); Thread.sleep(1000L);//                 1
						js1.executeScript("window.open('https://phptravels.com/demo/')");Thread.sleep(1000L);
						/*js.executeScript("window.open('https://rahulshettyacademy.com/dropdownsPractise/')");
						js.executeScript("window.open('https://demoqa.com/sortable')");
						js.executeScript("window.open('http://www.way2automation.com/demo.html')");
						js.executeScript("window.open('https://phptravels.com/demo/')");
						js.executeScript("window.open('https://jqueryui.com/demos/')");*/
						
					//ARRAY LISTS OF TABS 
							ArrayList<String> tabs1	= 	new ArrayList<String>(driver.getWindowHandles()); 
							driver.switchTo().window(tabs1.get(0));Thread.sleep(20000);
							driver.switchTo().window(tabs1.get(2));Thread.sleep(20000);
							driver.switchTo().window(tabs1.get(1));Thread.sleep(20000);
							//driver.switchTo().window(tabs1.get(1)); Thread.sleep(20);	 
					 
	}
	
}