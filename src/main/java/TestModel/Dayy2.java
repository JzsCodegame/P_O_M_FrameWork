/*package TestModel;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basemodel.BaseClass;
import pageModel.Dayy1;




public class Dayy2 extends BaseClass {
	//WebDriver Driver;

    Dayy1 y;

    

   

@BeforeTest

public void Setup () {

    //System.setProperty("webdriver.chrome.driver","C:\\Users\\jzo_0\\git\\repository3\\POM_AUT1\\chromedriver.exe");

   // driver = new ChromeDriver();

   // driver.manage().window().maximize();

   // driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

    String URL1 = ("http://automationpractice.com/index.php");

    driver.get(URL1);

    }             




@Test()
public void OpenSignInPage () {

    y = new Dayy1(driver);

    y.OpenSignInPage();

    String SignInPageTitle = y.SignInPageTitle();

    Assert.assertTrue(SignInPageTitle.contains("Login - My Store"));

    System.out.println(SignInPageTitle);

    }
}
*/