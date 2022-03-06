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
    
    SignUPForm SignUp;
    SignINForm Login;
    
	
	


	@Test(priority=0)

    public void Test_SignUp_Appears() {

        //Create Login Page object
		  driver.get(BaseUrl);
		
		  Login = new SignINForm(driver);
		//Verify login page title
		
		Login.openSignup();
		
		
		
		String signuppageTitle = Login.getFormpageTitle();
		    
		Assert.assertTrue(signuppageTitle.contains("Login -"));
		
	}

@Test(priority=1)
public void Fill_SignUp_Form() {
	 SignUp = new SignUPForm(driver);
	 SignUp.fillSignup("xel@gmail.com", "Jimmy", "Randall", "Randall2020");

}
}