package dataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;
import basemodel.BaseClass;

public class Test2 extends BaseClass {
	
		@Test(priority =0,dataProvider ="Test2", dataProviderClass = DataproviderClassStorage.class)
	      public void Sum (int a, int b, int result) throws InterruptedException{
		     int sum = a + b; 
		     
		     Assert.assertEquals(result, sum);
		     System.out.println(sum);
	}
		
		@Test (priority= 1,dataProvider ="Test2", dataProviderClass = DataproviderClassStorage.class)
		public void Diff (int a, int b, int result) throws InterruptedException{
		     int diff = a - b; 
		     
		     Assert.assertEquals(result, diff);
		     System.out.println(diff);
	}
	
}