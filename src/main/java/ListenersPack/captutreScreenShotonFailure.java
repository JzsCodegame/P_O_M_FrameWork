package ListenersPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import basemodel.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class captutreScreenShotonFailure extends BaseClass {
	
@Test
public void HomePageTest() {
		//WebDriverManager.chromedriver().browserVersion("83.0").setup();
//driver = new ChromeDriver();
//driver.manage().window().maximize();
driver.get("https://thoughtcoders.com/");
System.out.println("Title of WebPage: "+ driver.getTitle());
AssertJUnit.assertEquals("aThoughtCoders | Web Development, Automation,"
 + " QA Training", driver.getTitle());
driver.close();
}
}
