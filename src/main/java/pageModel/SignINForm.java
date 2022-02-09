package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignINForm {

	WebDriver driver;
	        @FindBy(tagName="title")
	        WebElement AutUrl;
		    
	        @FindBy(xpath= "//*[@class='login']")
	        WebElement Signin;
	        
public SignINForm(WebDriver driver) {

    this.driver = driver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);

}
		  
		  //Get the title of Page

		    public String getmainpageTitle()           {

		     return    driver.getTitle();

		                                        }
		   
		    //Click SignIn

		    public void clickSignIn() {

		        Signin.click();

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

	
	
	
	
	
	
	

