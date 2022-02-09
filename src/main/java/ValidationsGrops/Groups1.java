package ValidationsGrops;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;


public class Groups1 {
	public String baseUrl = "C:\\Users\\jzo_0\\git\\repository2\\POM_Automation_Selenium\\chromedriver.exe";
    String driverPath = "";
    public WebDriver driver; 



@BeforeTest(groups = {"smoke0"})
public void setup() {
    System.out.println("launching browser"); 
    System.setProperty("webdriver.chrome.driver", driverPath);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
}

@Test(priority = 0, groups = {"smoke2"})
public void getUrl() {
 driver.manage().window().maximize();
 driver.get(baseUrl);
 
}

@Test(priority =1, invocationCount =2, groups = {"functional1","Regression1"}, dependsOnMethods = {"getUrl"} )
public void fillInSignupForm1() {

WebElement Signin = driver.findElement(By.xpath("//*[@class='login']"));




Signin.click();
String expectedURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
String expectedURL1 = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
String actualURL = driver.getCurrentUrl();

//String expectedURL1 = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
//Assert.assertEquals(actualURL, expectedURL);
if ( actualURL != expectedURL) {
	AssertJUnit.assertEquals(actualURL, expectedURL1);
	System.out.println("Assert passed for Signin");
	System.out.println(actualURL);
}
else {
	
	System.out.println("assert Failed for Sign in");
}
WebElement EmailAddress = driver.findElement(By.xpath("//*[@name='email_create']"));
WebElement CreateanAccount =  driver.findElement(By.xpath("//*[@id='SubmitCreate']"));


EmailAddress.sendKeys("xaman6@gmail.com");
String expectedForm = "email_create";
String actualForm = driver.findElement(By.xpath("//*[@name='email_create']")).getAttribute("name");
AssertJUnit.assertEquals(actualForm, expectedForm);

CreateanAccount.click();
String expectedForm1 = "SubmitCreate";
String actualForm1 = driver.findElement(By.xpath("//*[@id='SubmitCreate']")).getAttribute("id");
AssertJUnit.assertEquals(actualForm1, expectedForm1);


WebElement Mr = driver.findElement(By.xpath("//input[@id='id_gender1']")); 
WebElement Mrs = driver.findElement(By.xpath("//input[@id='id_gender2']"));
WebElement FirstName = driver.findElement(By.cssSelector("input[id='customer_firstname']"));
WebElement LastName = driver.findElement(By.cssSelector("[id*='customer_lastname']"));
WebElement PassWord = driver.findElement(By.cssSelector("[id*='passwd']"));
WebElement Days = driver.findElement(By.cssSelector("[id*='days']"));
WebElement month = driver.findElement(By.cssSelector("[id*='month']"));
WebElement year = driver.findElement(By.cssSelector("#years"));
WebElement newsLettercheck = driver.findElement(By.cssSelector("#newsletter"));
WebElement specialOffers = driver.findElement(By.xpath("//input[contains(@id,'opt')]"));  
WebElement Company = driver.findElement(By.xpath("//input[contains(@id,'com')]")); 
WebElement Address = driver.findElement(By.cssSelector("input.form-control[id='address1']")); 
WebElement City = driver.findElement(By.cssSelector("#city")); 
WebElement State = driver.findElement(By.cssSelector("select[id*='_state']"));
WebElement ZipPostalCode = driver.findElement(By.cssSelector("#postcode"));
WebElement Country = driver.findElement(By.cssSelector("select[id$='ntry']"));
WebElement AdditionalInformation = driver.findElement(By.cssSelector("#other"));
WebElement Homephone = driver.findElement(By.cssSelector("#phone"));
WebElement Mobilephone = driver.findElement(By.cssSelector("#phone_mobile"));
WebElement Assignanaddress = driver.findElement(By.cssSelector("#alias"));





Mr.click();
AssertJUnit.assertEquals(true, Mr.isSelected());
AssertJUnit.assertEquals(false, Mrs.isSelected());
System.out.println("Radio button Mr is selected ? Assert passed");
System.out.println("Radio button Mrs is not selected ? Assert passed");


FirstName.sendKeys("Chris");
System.out.println("Radio button Mr is selected ? Assert passed");

LastName.sendKeys("Doris");
AssertJUnit.assertEquals(true, LastName.isDisplayed());
System.out.println("Radio button Mr is selected ? Assert passed");

PassWord.sendKeys("jkl456");
System.out.println("Radio button Mr is selected ? Assert passed");

Days.click();
Select sinput = new Select(Days);
sinput.selectByValue("15");
System.out.println("Radio button Mr is selected ? Assert passed");

Select sinput1 = new Select(month);
sinput1.selectByValue("9");
System.out.println("Radio button Mr is selected ? Assert passed");

Select sinput2 = new Select(year);
sinput2.selectByValue("1992");
Select select = new Select(year);
String option = select.getFirstSelectedOption().getText();
AssertJUnit.assertEquals("1992  ", option);

 newsLettercheck.click();
 
 String expectedForm2 = "checkbox";
    String actualForm2 = newsLettercheck.getAttribute("type");
    AssertJUnit.assertEquals(actualForm2, expectedForm2);
      
    specialOffers.click();
    AssertJUnit.assertEquals(true,specialOffers.isSelected());
    
    
    Company.sendKeys("Ltec");
    String expected = "Ltec";
    String actual = driver.findElement(By.xpath("//input[contains(@id,'com')]")).getAttribute("value");
    AssertJUnit.assertEquals(actual, expected);
    System.out.println(actual);
    
    
    Address.sendKeys("186 Crescent");
    AssertJUnit.assertEquals("186 Crescent", driver.findElement(By.cssSelector("input.form-control[id='address1']")).getAttribute("value"));
    
    
    City.sendKeys("buffalo");
    String cityValue = driver.findElement(By.cssSelector("#city")).getAttribute("value");
    AssertJUnit.assertEquals("buffalo", cityValue);
    System.out.println(cityValue);
   
    
    Select sinput4 = new Select(State);
	sinput4.selectByValue("53");
	String option1 = sinput4.getFirstSelectedOption().getText();
	AssertJUnit.assertEquals("District of Columbia", option1);
    
    
    
    ZipPostalCode.sendKeys("11315");
    
    String zipValue = driver.findElement(By.cssSelector("#postcode")).getAttribute("value");
    AssertJUnit.assertEquals("11315", zipValue);
    
    
    
    Country.click();
    Select sinput5 = new Select(Country);
	String option2 = sinput5.getFirstSelectedOption().getText();
	AssertJUnit.assertEquals("United States", option2);
    
    
    AdditionalInformation.sendKeys("otherinfo");
    
    AdditionalInformation.sendKeys("Extrainfo");
    AssertJUnit.assertEquals(true, AdditionalInformation.isDisplayed());
    
    
    
    Homephone.sendKeys("5142806539");
    AssertJUnit.assertEquals(true, AdditionalInformation.isDisplayed());
    String homphoneValue = driver.findElement(By.cssSelector("#phone")).getAttribute("value");
    AssertJUnit.assertEquals("5142806539",homphoneValue);
    
    
    Mobilephone.sendKeys("8134568520");
    AssertJUnit.assertEquals(true, Mobilephone.isEnabled());
    String MobileValue = driver.findElement(By.cssSelector("#phone_mobile")).getAttribute("value");
    AssertJUnit.assertEquals("8134568520", MobileValue);
    
    //WebElement Assignanaddress = driver.findElement(By.cssSelector("#alias"));
    int Assignanaddressverf = driver.findElements(By.xpath("//input[@type='text' and @id='alias']")).size();

    if (Assignanaddressverf==1) {

    System.out.println("verified");

    }
    Assignanaddress.sendKeys("157");
    driver.navigate().refresh();
}	    




@Test(dependsOnMethods = {"fillInSignupForm1"} )
    public void quit() {
    driver.close();

}
}
