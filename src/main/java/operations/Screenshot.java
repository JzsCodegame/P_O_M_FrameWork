package operations;


import org.testng.annotations.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import basemodel.BaseClass;



public class Screenshot extends BaseClass {

	//WebDriver driver;
	
	  
	/*  @BeforeTest
	public void setup() {
           //System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  //driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
	}
	  */

	  
@Test(priority = 0)
	  public static void testGuru99TakeScreenShot() throws Exception{


	  //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  //driver = new ChromeDriver();

	  //goto url

	 driver.get("http://demo.guru99.com/V4/");

	  //Call take screenshot function
	 String FileLocation = "C:\\Users\\***\\Documents\\test.png";
	  //needs to be changed for each local drive
	 Screenshot.takeSnapShot(driver, FileLocation) ;
      
	  }

	  /**

	  * This function will take screenshot
	  * @param webdriver

	  * @param fileWithPath

	  * @throws Exception

	  */

	  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	  //Convert web driver object to TakeScreenshot
        
	  TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	  //Call getScreenshotAs method to create image file

	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	  //Move image file to new destination

	  File DestFile=new File(fileWithPath);

	  //Copy file at destination

	  Files.copy(SrcFile, DestFile);

	  }//Guru99 Bank Home Pagehttp://demo.guru99.com
	
	
}
