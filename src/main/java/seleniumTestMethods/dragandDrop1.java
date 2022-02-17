package seleniumTestMethods;

import org.testng.annotations.Test;

import basemodel.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragandDrop1 extends BaseClass {

	//WebDriver driver;
	
	  
	
	  
	 @Test(priority = 0)
	  public void Drop() {
	  String baseUrl = "http://demo.guru99.com/test/newtours/";
      //System.setProperty("webdriver.gecko.driver","geckodriver.exe");
              //WebDriver driver = new FirefoxDriver();

              driver.get(baseUrl);           
              WebElement source = driver.findElement(By.linkText("Home"));
              //find target same way as bottom page
             WebElement td_Home = driver
                      .findElement(By
                      .xpath("//html/body/div"
                      + "/table/tbody/tr/td"
                      + "/table/tbody/tr/td"
                      + "/table/tbody/tr/td"
                      + "/table/tbody/tr"));    
               
              Actions builder = new Actions(driver);
              Action mouseOverHome = builder
                      .moveToElement(td_Home)
                      .build();
               
              String bgColor = td_Home.getCssValue("background-color");
              System.out.println("Before hover: " + bgColor);        
              mouseOverHome.perform();        
              bgColor = td_Home.getCssValue("background-color");
              System.out.println("After hover: " + bgColor);
             // driver.close();
	  }
	  /*
	  @Test(priority = 1)
	  public void actionbuilder() {
	  String baseUrl = "http://www.facebook.com/"; 
	  //WebDriver driver = new FirefoxDriver();

	  driver.get(baseUrl);
	  WebElement txtUsername = driver.findElement(By.id("email"));
	  WebElement password = driver.findElement(By.id("pass"));
	  Actions builder = new Actions(driver);
	  Action seriesOfActions = builder
	  	.moveToElement(password)
	  	.click()
	  	.keyDown(password, Keys.SHIFT)
	  	.sendKeys(password, "hello")
	  	.keyUp(password, Keys.SHIFT)
	  	.doubleClick(password)
	  	.contextClick()
	  	.build();
	  	
	  seriesOfActions.perform() ;
	  }
	  */
}
