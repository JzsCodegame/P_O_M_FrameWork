package pageModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import dataProvider.DataproviderClassStorage;

public class SignUPForm {

	WebDriver driver;
    @FindBy(tagName="title")
    WebElement AutUrl;
    
    @FindBy(xpath= "//*[@class='login']")
    WebElement Signin;
    
    @FindBy(xpath= "//*[@name='email_create']")
    WebElement EmailAddress;
    
    @FindBy(xpath= "//*[@id='SubmitCreate']")
    WebElement CreateanAccount;
    
    @FindBy(css= ".page-subheading") 
    WebElement signupForm;
    
    
    @FindBy(xpath= "//input[@id='id_gender1']")
    WebElement Mr;
    
    @FindBy(xpath= "//input[@id='id_gender2']") 
    WebElement Mrs;
    
    @FindBy(css= "input[id='customer_firstname']")
    WebElement FirstName;
    
    @FindBy(css= "[id*='customer_lastname']")
    WebElement LastName;
  
    @FindBy(css = "[id*='passwd']")
    WebElement PassWord;
    
    @FindBy(css= "[id*='days']")
    WebElement Days;
    
    @FindBy(css= "[id*='month']")
    WebElement month;
    
    @FindBy(css= "#years")
    WebElement Year;
    
    @FindBy(css= "#newsletter")
    WebElement newsLettercheck;
    
    @FindBy(xpath= "//input[contains(@id,'opt')]") 
    WebElement specialOffers;
    
    @FindBy(xpath= "//input[contains(@id,'com')]")
    WebElement Company;
    
    @FindBy(css= "input.form-control[id='address1']")
    WebElement Address;
    
    @FindBy(css= "#city")
    WebElement City;
    
    @FindBy(css= "select[id*='_state']")
    WebElement State;
    
    @FindBy(css= "#postcode")
    WebElement ZipPostalCode;
    
    @FindBy(css= "select[id$='ntry']")
    WebElement Country;
    
    @FindBy(css= "#other")
    WebElement AdditionalInformation;
    
    @FindBy(css= "#phone")
    WebElement HomephoneHomephone;
    
    @FindBy(css= "#phone_mobile")
    WebElement Mobilephone;
    
    @FindBy(css= "#alias")
    WebElement Assignanaddress;
   
    
    
    
    
public SignUPForm(WebDriver driver) {

this.driver = driver;

//This initElements method will create all WebElements

PageFactory.initElements(driver, this);

}
public String getSignInTitle() {

    return driver.getTitle();
  }
  

public void setEmail(String EmailString) {

  EmailAddress.sendKeys(EmailString);
   

}

//Click on Craete Account button

public void clickAccountButton() {

        CreateanAccount.click();

}

//Get the title of Sign Page



public void selectRadiobtn1() {
	Mr.click();;
}
public void selectRadiobtn2() {
	
	Mrs.click();
}

public void enterFirstname(String Firstname) {
	FirstName.sendKeys(Firstname);
}

public void enterLastName(String Randall) {
	LastName.sendKeys(Randall);
}

public void enetrPassWord(String Randall20) {
	PassWord.sendKeys(Randall20);
}
public void selectDays(String sinputDays) {
	Days.click();
	Select sinput = new Select(Days);
	sinput.selectByValue(sinputDays);
}
@Test(priority=1, dataProvider="Test1",dataProviderClass = DataproviderClassStorage.class)
public void fillSignup(String data,String EmailString, String FirstName, String LastName, String PassWord/*,String sinputDays*/) {
	//char[] helloArray = { 'x', 'e', 'l', '@', 'g', 'm','a','i','l','.','c','o','m'};
	//helloString = new String(helloArray); 

this.setEmail(EmailString);
this.clickAccountButton();

this.selectRadiobtn1();
//this.selectRadiobtn2();
this.enterFirstname(FirstName);
this.enterLastName(LastName);
this.enetrPassWord(PassWord);
//this.enetrPassWord(sinputDays);



}


}


	

