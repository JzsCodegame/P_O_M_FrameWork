package operations;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uioperation {

	

		 WebDriver driver;
		    public uioperation(WebDriver driver){
		        this.driver = driver;
		    }
		    public void perform(Properties read,String operation,String objectName,String objectType,String value) throws Exception{
		        System.out.println("");
		        switch (operation.toUpperCase()) {
		        case "gotoUrl":
		            //Get url of application
		        	driver.get(read.getProperty(value));
		            break;
		            
		            
		          //Perform click
		        case "clickSign":
		        	driver.findElement(this.getObject(read,objectName,objectType)).click();
		            
		            break;
		          
		          //Get text of an element   
		        case "OpenAuthenficatioin":
		        	driver.getCurrentUrl();
		        	break;
		        
		          //Set text on control
		        case "typemail":
		            driver.findElement(this.getObject(read,objectName,objectType)).sendKeys(value);
		            break;
		          //Perform click
		        case "clicksubmit":
		        	driver.findElement(this.getObject(read,objectName,objectType)).click();
		            break;
		            
		            /*driver.findElement(this.getObject(read,objectName,objectType)).getText();
		            break;
		            driver.get(read.getProperty(value));
		            break;*/
		        default:
		            break;
		        }
		    }
		    
		    /**
		     * Find element BY using object type and value
		     * @param read
		     * @param objectName
		     * @param objectType
		     * @return
		     * @throws Exception
		     */
		    private By getObject(Properties read,String objectName,String objectType) throws Exception{
		        //Find by xpath
		        if(objectType.equalsIgnoreCase("XPATH")){
		            
		            return By.xpath(read.getProperty(objectName));
		        }
		      //find by ID
		        else if(objectType.equalsIgnoreCase("ID")){
		            
		            return By.className(read.getProperty(objectName));
		            
		        }
		        //find by class
		        else if(objectType.equalsIgnoreCase("CLASSNAME")){
		            
		            return By.className(read.getProperty(objectName));
		            
		        }
		        //find by name
		        else if(objectType.equalsIgnoreCase("NAME")){
		            
		            return By.name(read.getProperty(objectName));
		            
		        }
		        //Find by css
		        else if(objectType.equalsIgnoreCase("CSS")){
		            
		            return By.cssSelector(read.getProperty(objectName));
		            
		        }
		        //find by link
		        else if(objectType.equalsIgnoreCase("LINK")){
		            
		            return By.linkText(read.getProperty(objectName));
		            
		        }
		        //find by partial link
		        else if(objectType.equalsIgnoreCase("PARTIALLINK")){
		            
		            return By.partialLinkText(read.getProperty(objectName));
		            
		        }else
		        {
		            throw new Exception("Wrong object type");
		        }
		    
	
	
	}

}
