package seleniumTestMethods;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import basemodel.BaseClass;

public class Wbtables_max_value extends BaseClass {

	public  void webtab1() throws ParseException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe"); // Setting system properties of FirefoxDriver
		//WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		//WebDriverWait X = new WebDriverWait(driver, 3);
		//driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List<WebElement>  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List<WebElement>  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
	            max= driver.findElement(By.xpath("//table[@class='dataTable']/descendant::tr[" + (i+1)+ "]/td[4]")).getText();
	                                                                                                        //Gettext goes with String type
	            
	            
	            
	            // explain "html/body/div[1]/div[5]/table/tbody/tr[" + (i+1)+ "]/td[4]"
	            //[] refers to the position of the tr
	            // "****"  where the regex fits
	            //+ is a operator in xpath
	            //(i+1) is part of regex
	            //i refers to the for loop size of the row
	            //+ the operator and it starts from the 1
	            //Gettext goes with String type
	            
	            NumberFormat f =NumberFormat.getNumberInstance(); //What is Numberformat
	            Number num = f.parse(max);//What is Numberformat()// NumberFormat allows us to round values, set decimal separators, set the number of fraction digits,
	                                                                  // or format values according to a specific locale.
	            													  //
	            max = num.toString();//What is tostring()
	            m = Double.parseDouble(max);//What is parseDouble()
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
	      int MangaloreRefine = driver.findElements(By.xpath("//a[contains(text(),'Mangalore Refine')]")).size();
		if (MangaloreRefine==1) {
	        
	          driver.findElement(By.xpath("//a[contains(text(),'Mangalore Refine')]")).click();
	                          //tagname[contains(text(),'value')]
		
	}
		else {	
			driver.navigate().refresh();
			System.out.println("Maximum current price is");
	}
	}}
