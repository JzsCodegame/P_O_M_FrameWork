package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basemodel.BaseClass;

public class Test4 extends BaseClass {
	
	@Test(priority = 0,dataProvider="Test4",groups="C", dataProviderClass = DataproviderClassStorage.class)
	public void MethodD(String author,String searchKey) throws InterruptedException{
		{
		  //find google search box
			driver.get("https://google.com");
			WebElement searchText = driver.findElement(By.name("q"));
			//search a value on it
			searchText.sendKeys(searchKey);
			System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
			Thread.sleep(3000);
			String testValue = searchText.getAttribute("value");
			System.out.println(testValue +"::::"+searchKey);
			searchText.clear();
			//verify correct value in searchbox
			Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}
	}
	@Test(priority = 1,dataProvider="Test4",groups="D",dataProviderClass = DataproviderClassStorage.class)
	public void MethodE(String author,String searchKey) throws InterruptedException{
		{
		  //search google textbox
			driver.get("https://google.com");
			WebElement searchText = driver.findElement(By.name("q"));
			//search a value on it
			searchText.sendKeys(searchKey);
			System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
			Thread.sleep(3000);
			String testValue = searchText.getAttribute("value");
			System.out.println(testValue +"::::"+searchKey);
			searchText.clear();
			//verify correct value in searchbox
			Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}
	}
}
