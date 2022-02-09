package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignInPage  {

	  WebDriver driver;
        By AutUrl = By.tagName("title");
	    By Signin = By.xpath("//*[@class='login']");
	    
	    

	    public SignInPage(WebDriver driver) {

	        this.driver = driver;

	                                        }
	  
	  //Get the title of Page

	    public String getmainpageTitle()           {

	     return    driver.getTitle();

	                                        }
	   
	    //Click SignIn

	    public void clickSignIn() {

	        driver.findElement(Signin).click();

	    }
	    
	    //get title of form page
	    public String getFormpageTitle()           {

		     return    driver.getTitle();

		                                        }
	

	    public void openSignup() {

	        //Fill Fill Email name
	    	this.getmainpageTitle();
	    	this.clickSignIn();
	    	this.getFormpageTitle();
	        
             
	    }

}



		 






