package dataProvider;



import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import basemodel.BaseClass;

public class Test3 extends BaseClass {
	@Test(dataProvider="Test3", groups="A",dataProviderClass = DataproviderClassStorage.class)//dataProviderClass = DataproviderClassStorage.class
	public void MethodB(String author,String searchKey) throws InterruptedException{
		
		  //find google search box
			driver.get("https://google.com");
			WebElement searchText = driver.findElement(By.name("q"));
			//search a value on it
			searchText.sendKeys(searchKey);
			System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
			Thread.sleep(3000);
			String testValue = searchText.getAttribute("value");
			System.out.println(testValue +"::::"+searchKey);
			//searchText.clear();
			//verify correct value in searchbox
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	
	}
	@Test(dataProvider="Test3",groups="B",dataProviderClass = DataproviderClassStorage.class)//,dataProviderClass = DataproviderClassStorage.class
	public void MethodC(String author,String searchKey2) throws InterruptedException{
		
		  //search google textbox
			driver.get("https://google.com");
			WebElement searchText = driver.findElement(By.name("q"));
			//search a value on it
			searchText.sendKeys(searchKey2);
			System.out.println("Welcome ->"+author+" Your search key is->"+searchKey2);
			Thread.sleep(3000);
			String testValue = searchText.getAttribute("value");
			System.out.println(testValue +"::::"+searchKey2);
			//searchText.clear();
			//verify correct value in searchbox
			Assert.assertTrue(testValue.equalsIgnoreCase(searchKey2));
	
	}
}
