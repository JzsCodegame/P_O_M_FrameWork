package seleniumTestMethods;



import org.testng.annotations.Test;

import basemodel.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class UploadFile extends BaseClass{
//ChromeDriver driver;
	
	
	/*@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
	}*/
		
		@Test
		public void upload() {
			driver.get("http://demo.guru99.com/test/upload/");
			String filocation = "C:\\Users\\jzo_0\\Documents\\DevOps\\AWS-VPC.pdf";
			
			driver.findElement(By.cssSelector("#uploadfile_0")).sendKeys(filocation);
		
	}
	
}
