package TestModel;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunSignIn extends BaseClass {
	
	
	
	@BeforeTest
	
	public void setup() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void openurl() {
		driver.get("http://automationpractice.com/index.php");
	}

}
