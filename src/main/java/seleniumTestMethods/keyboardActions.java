package seleniumTestMethods;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class keyboardActions extends BaseClass {
	
	
	  
	  @BeforeTest
	public void setup() {
        //System.setProperty("webdriver.gecko.driver","geckodriver.exe");
      //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  //driver = new ChromeDriver();
		 
		  
		  driver_firefox.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		  driver_firefox.manage().window().maximize();
	}
	  
	  @Test
	  public void actionbuilder() {
		  String baseUrl = "http://www.facebook.com/";
		  

		  driver_firefox.get(baseUrl);
		  WebElement txtUsername = driver_firefox.findElement(By.id("email"));

		  Actions builder = new Actions(driver_firefox);
		  Action seriesOfActions = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
		  .sendKeys(txtUsername, "hello")
		  .keyUp(txtUsername, Keys.SHIFT)
		  .doubleClick(txtUsername)
		  .contextClick().build();

		  seriesOfActions.perform() ;
		  }
}

