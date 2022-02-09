package seleniumTestMethods;

import org.testng.annotations.Test;

import basemodel.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass {
	 // WebDriver driver;
	
	  
	
	
	@Test
	public void draganddrop() {
	  String URL = "https://demoqa.com/droppable/";
	  driver.get(URL);
	
	
	
	//Actions class method to drag and drop 
	
	Actions builder = new Actions(driver);
	WebElement from = driver.findElement(By.id("draggable"));//source
	WebElement to = driver.findElement(By.id("droppable")); //target
	
	
	
	//Perform drag and drop
	builder.dragAndDrop(from, to).build().perform();
	
	//verify text changed in to 'Drop here' box 
	
	 
	String textTo = to.getText();
	
	if(textTo.equals("Dropped!")) {
	System.out.println("PASS: File is dropped to target as expected");
	}else {
	System.out.println("FAIL: File couldn't be dropped to target as expected");
	}
	
	
	//driver.close();
	
}
}