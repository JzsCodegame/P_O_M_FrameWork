package seleniumTestMethods;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class Actions1 extends BaseClass{
	
	//WebDriver driver;
	
	
	@Test(priority = 0)
	public void actionset1() throws InterruptedException {
		// TODO Auto-generated method stub
		
			 
			 
			
			 
			 //driver.get("http://spicejet.com");
			 
			 
			 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			 
			driver.findElement(By.id("divpaxinfo")).click();

			   Thread.sleep(1000);

			/*int i=1;
			while(i<9)

			{

			driver.findElement(By.id("hrefIncAdt")).click(); // using xpath or findelement scripting click 8 times
			

			i++;
			}*/
			

			   //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			   //Thread.sleep(1000);
			   //driver.findElement(By.id("divpaxinfo")).click();
			   
			   for(int i=1;i<9;i++)   // Execute Line for 8 times

			
				   {
            
			
				   driver.findElement(By.id("hrefincAdt")).click();

			
				   }
			   
			   
			   
			    String ActualResult = driver.findElement(By.id("divpaxinfo")).getText();// Validation Assert 
				String ExpectedResult = "9 Adult";
				AssertJUnit.assertEquals(ActualResult, ExpectedResult);
				
			
			   
			WebElement Button = driver.findElement(By.id("btnclosepaxoption"));
			System.out.println("Done Button is Displayed?" + Button.isSelected()); //validation1
			System.out.println("Done Button is Displayed?" + Button.isDisplayed());//validation2
			System.out.println("Done Button is Displayed?" + Button.isEnabled());//validation3
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//validation4
			
			Button.click();
			
			 Thread.sleep(2000);
			 WebElement Departure =  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
					 Departure.click();
					 
					 Thread.sleep(2000);	 
					 driver.findElement(By.xpath("//option[@value='BLR']")).click(); // this is the 1st child so doesnt need index.
			 
					 WebElement Arrival = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
					 Arrival.click();
					 Thread.sleep(2000);
					 
					 driver.findElement(By.xpath("(//option[@value='MAA'])[2]")).click(); //This Is the Index Method By finding the child 
					 
		/*Select Sinput = new Select(Departure);  // This the Select method  and has list of options with value
			 Sinput.selectByValue("DAC");
			
			 Arrival.click();
			 
			 Select Sinput2 = new Select(Arrival);
			 Sinput2.selectByValue("DEL");
			 Thread.sleep(2000);
			 Departure.click();*/
			 
			 
	}
	
	@Test(priority = 1)
	public void actionset2() throws InterruptedException {
	
	            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 driver.findElement(By.id("divpaxinfo")).click();
		 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		 Thread.sleep(1000);
		 
		 WebElement addup = driver.findElement(By.id("hrefIncAdt")); // the plus buton for adults
		 
		 Actions action = new Actions(driver);
		 
		 Action seriesOfActions = action.moveToElement(addup).click().build();// 
			
		//seriesOfActions.perform();
		 
			for(int i=1;i<5;i++)

			{

			
				seriesOfActions.perform();// Using mouse actions 

			}
		          driver.findElement(By.id("btnclosepaxoption"));

			AssertJUnit.assertEquals(driver.findElement(By.id("divpaxinfo")).getText() ,"5 Adult");

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
			WebElement search = driver.findElement(By.id("autosuggest"));
			
			Action seriesOfActions2 = action.moveToElement(search).click().sendKeys("Bang").sendKeys(Keys.ARROW_DOWN).build();
			
			seriesOfActions2.perform();
			
	}
	
	
}
