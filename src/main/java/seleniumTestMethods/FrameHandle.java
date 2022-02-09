package seleniumTestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basemodel.BaseClass;


public class FrameHandle extends BaseClass {

	public void frames1() {
		// TODO Auto-generated method stub
		//WebDriver driver;		   
		   
	    // driver = new ChromeDriver();
	       
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	

		 
		 
		 String url1 = "file:///C:/Users/jzo_0/Downloads/framenested2.htm";	
		 
		 driver.get("file:\\C:\\Users\\jzo_0\\Downloads\\AutomationPractice\\Selenium Practice\\framenested2.htm");
		 
		// driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		 
		 //driver.switchTo().frame(0); // By Index number ---- Rule 1
		 
		 
		 driver.switchTo().frame("iframe3"); // By name or Id Attribute value..----- Rule 2
		 
		
		 
		 //driver.switchTo().frame("iframe1"); // By WebElement first we switch to frame --- Rule 2 + Rule 3 --- this is the child frame --index 0
		 
		 //driver.switchTo().frame("iframe2"); //index 1
		 
		// driver.switchTo().frame("iframe3");// index 2
		 
		// ArrayList <String> frames = new ArrayList <String>();
		// frames.add("driver.switchTo().frame(\"iframe2\")");
		 //driver.findElement(By.xpath("//iframe[@src='framenested3.htm']")).click(); // then we write the xpath---Rule 3
		// System.out.printf(frames.get(0));
		 
		 
		 driver.findElement(By.name("userName")).sendKeys("javid");
		 
		 driver.findElement(By.name("usePwd")).sendKeys("javid");
		 
		 //driver.switchTo().defaultContent();      // ---- this is rule  2
		 
		 driver.switchTo().parentFrame();  //---- this is the parent frame -- rule 1 ---
		 //driver.switchTo().parentFrame(); // --- this going back to iframe1
		 
		 
		 WebElement Login = driver.findElement(By.xpath("//button[@name='Login']"));
		 
		 Login.click();
		 
		 Login.isDisplayed();  // will give us true or false answer
		 
		 System.out.println(driver.getCurrentUrl());
		 
	}
	}
