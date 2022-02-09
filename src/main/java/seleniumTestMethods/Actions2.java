package seleniumTestMethods;

import org.testng.annotations.Test;

import basemodel.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions2 extends BaseClass {

	  
	  @Test(priority = 0)
	  public void actionbuilder() {
		  String baseUrl = "http://www.facebook.com/";
		  

		  driver.get(baseUrl);
		  WebElement txtUsername = driver.findElement(By.id("email"));

		  Actions builder = new Actions(driver);
		  Action seriesOfActions = builder
		  .moveToElement(txtUsername)
		  .click()
		  .keyDown(txtUsername, Keys.SHIFT)
		  .sendKeys(txtUsername, "hello")
		  .keyUp(txtUsername, Keys.SHIFT)
		  .doubleClick(txtUsername)
		  .contextClick()
		  .build();

		  seriesOfActions.perform() ;
		  }
}
