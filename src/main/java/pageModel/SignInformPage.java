package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInformPage {

	WebDriver driver;
	By EmailAddress = By.xpath("//*[@name='email_create']");
    By CreateanAccount =By.xpath("//*[@id='SubmitCreate']");
    By signupForm = By.cssSelector(".page-subheading");
	By Mr = By.xpath("//input[@id='id_gender1']");
    By Mrs = By.xpath("//input[@id='id_gender2']");
    By FirstName = By.cssSelector("input[id='customer_firstname']");
    By LastName = By.cssSelector("[id*='customer_lastname']");
    By PassWord = By.cssSelector("[id*='passwd']");
    By Days = By.cssSelector("[id*='days']");
    By month = By.cssSelector("[id*='month']");
    By Year = By.cssSelector("#years");
    By newsLettercheck = By.cssSelector("#newsletter");
    By specialOffers = By.xpath("//input[contains(@id,'opt')]");  
    By Company = By.xpath("//input[contains(@id,'com')]"); 
    By Address = By.cssSelector("input.form-control[id='address1']"); 
    By City = By.cssSelector("#city"); 
    By State = By.cssSelector("select[id*='_state']");
    By ZipPostalCode = By.cssSelector("#postcode");
    By Country = By.cssSelector("select[id$='ntry']");
    By AdditionalInformation = By.cssSelector("#other");
    By Homephone = By.cssSelector("#phone");
    By Mobilephone = By.cssSelector("#phone_mobile");
    By Assignanaddress = By.cssSelector("#alias");
	
    
     
    
    
	public SignInformPage(WebDriver driver) {

        this.driver = driver;

    }
    
    public String getSignInTitle() {

      return driver.getTitle();
    }
    
    
  
    //Set email in email textbox

    public void setEmail(String helloString) {

       driver.findElement(EmailAddress).sendKeys(helloString);
       

    }
    
  //Click on Craete Account button

    public void clickAccountButton() {

            driver.findElement(CreateanAccount).click();

    }
    
//Get the title of Sign Page

   

    public void selectRadiobtn1() {
    	driver.findElement(Mr).click();;
    }
    public void selectRadiobtn2() {
    	
    	driver.findElement(Mrs).click();
    }
    
    public void enterFirstname(String Jimmy) {
    	driver.findElement(FirstName).sendKeys(Jimmy);
    }
 
    public void enterLastName(String Randall) {
    	driver.findElement(LastName).sendKeys(Randall);
    }
    public void enetrPassWord(String Randall20) {
    	driver.findElement(PassWord).sendKeys(Randall20);
    }
   
    public void fillSignup(String EmailAddress, String FirstName, String LastName, String PassWord) {
    	//char[] helloArray = { 'x', 'e', 'l', '@', 'g', 'm','a','i','l','.','c','o','m'};
    	//helloString = new String(helloArray); 
    
    this.setEmail(EmailAddress);
    this.clickAccountButton();
    
    this.selectRadiobtn1();
    //this.selectRadiobtn2();
    this.enterFirstname(FirstName);
    this.enterLastName(LastName);
    this.enetrPassWord(PassWord);
    
    
    
    
}
    
    
}
