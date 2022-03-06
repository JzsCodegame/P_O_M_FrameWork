/*package TestModel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import basemodel.BaseClass;
import pageModel.SignInPage;
import pageModel.SignInformPage;



@Test
public class SignInTestcase extends BaseClass {

    //String driverPath = "C:\\geckodriver.exe";
    
 WebDriver driver;

    SignInPage objLogin;

    SignInformPage objHomePage;
    
    
    //2nd Method
    SignUPForm SignInForm;
    SignINForm Login;
/*

     * This test case will login in http://demo.guru99.com/V4/

     * Verify login page title as guru99 bank

     * Login to application

     * Verify the home page using Dashboard message

     */

/* 
 * @Test(priority=0)
 

    public void test_Page_Appear_Correct() {

        //Create Login Page object
	
	  driver.get("http://automationpractice.com/index.php");

	Login = new SignINForm(driver);

    //Verify login page title

    String loginPageTitle = Login.getmainpageTitle();

  Assert.assertTrue(loginPageTitle.contains("My Store"));

    //login to application

    //Login.openSignup();
    
    //String signuppageTitle = Login.getFormpageTitle();
    
    //Assert.assertTrue(signuppageTitle.contains("Sign In"));
    
}
    // go the next page
}  




/*public void test_Form_Page_Appear_Correct() {
    
    	objHomePage = new SignInformPage(driver);
    	
    	Assert.assertTrue(objHomePage.getSignInTitle().toLowerCase().contains(""));
    //Verify home page
    	
   
    */

