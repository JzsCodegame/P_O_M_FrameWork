package seleniumTestMethods;

import org.testng.annotations.Test;

import basemodel.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Scrolling extends BaseClass {
	
	 //WebDriver driver = new FirefoxDriver();
	 

	/* @BeforeTest
	 public void setup() {
		 System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		 driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy");
		 driver.manage().window().maximize();
		 
	 }*/
	 @Test(priority = 0)
public void scrollDown() throws InterruptedException {
	
	 driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy");
	 
	//to perform Scroll on application using Selenium
	//js1.executeScript("window.scrollBy(0, 500), '';");
	js1.executeScript("window.scroll(0, 5000);");
	Thread.sleep(3000);
}
@Test(priority = 1)
	 public void scrollUp() throws InterruptedException {
		driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollBy");
		 
		//to perform Scroll on application using Selenium
		//JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scroll(0, -5000), '';");
		Thread.sleep(3000);
    }
		

	@Test(priority = 2)
	public void toElement() throws InterruptedException {
		driver.get("https://www.w3schools.com/jsref/met_win_scrollto.asp");
		WebElement Element = driver.findElement(By.linkText("scrollTo()"));
		js1.executeScript("arguments[0].scrollIntoView();", Element);// horizontal scrolling targeting the element.
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js1.executeScript("window.scroll(0, -450);");
		Thread.sleep(3000);
	}
	
}
