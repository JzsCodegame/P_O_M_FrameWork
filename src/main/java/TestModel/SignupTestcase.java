package TestModel;

import org.testng.Assert;
import org.testng.annotations.Test;


import basemodel.BaseClass;
import dataProvider.DataproviderClassStorage;
import pageModel.SignINForm;
import pageModel.SignInPage;
import pageModel.SignInformPage;
import pageModel.SignUPForm;



@Test
public class SignupTestcase extends BaseClass  {
	
//WebDriver driver;

	SignInPage objLogin;

    SignInformPage objHomePage;
    
    SignUPForm SignInForm;
    SignINForm Login;
    
	


	@Test(priority=0)

    public void Test_SignUp_Appears() {

        //Create Login Page object
		  driver.get("http://automationpractice.com/index.php");
		
		Login = new SignINForm(driver);
		SignInForm = new SignUPForm(driver);
		//Verify login page title
		
		//Login.openSignup();
		Login.clickSignIn();
		
		
		String signuppageTitle = Login.getFormpageTitle();
		    
		Assert.assertTrue(signuppageTitle.contains("Login -"));
		
	}

	@Test(priority=1, dataProvider="Test1",dataProviderClass = DataproviderClassStorage.class)
	public void Fill_SignUp_Form(String key) {
		//getDataForPom X= new getDataForPom();
		
		SignInForm.fillSignup(key);//"xel@gmail.com" , "Jimmy", "Randall", "Randall2020"/*,"sinputDays"*/);//Positive testing 
		
		//public void Fill_SignUp_Form1() 2nd Attempt with Information
		//SignInForm.fillSignup("xel@gmail.comm" , "Jimmy20", "Randall20", "Randall2020"/*,"sinputDays"*/); //Negative Testing
}
	@Test(priority=2)
	public void Fill_SignUp_Form1() {
		
		SignInForm.selectDays("15");
	}
	

}