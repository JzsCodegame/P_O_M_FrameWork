package dataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


public class DataproviderClassStorage {
        @DataProvider(name="Test1")
        public static Object[][] getDataFromDataprovider0(){
            return new Object[][] {
                { "Guru99", "India" },
                { "Krishna", "UK" },
                { "Bhupesh", "USA" }
            };
            }
        @DataProvider(name="SignUpTest1")
        public static Object[][] getDataForPom(){
            return new Object[][] {
                { "xel@gmail.com" , "Jimmy", "Randall", "Randall2020" },
                //{ "Krishna", "UK" },
                //{ "Bhupesh", "USA" }
            };
            }
            
            @DataProvider (name ="Test2")
        	public Object[][] AMethod (Method m){
        		switch (m.getName()) {
        		case "Sum": 
        			return new Object[][] {{2, 3 , 5}, {5, 7,12}};
        		case "Diff": 
        			return new Object[][] {{2, 3, -1}, {5, 7, -2}};
        		}
        		return null;
        	}	  
            
            
            @DataProvider(name = "ParamTest1")
          	public Object[][] dataProvFunc(){
                	return new Object[][]{
                      	{"Lambda Test"},{"Automation"}
                	};
          	}
            
            @DataProvider(name="Test4")
            public Object[][] getDataFromDataprovider1(Method m){
                if(m.getName().equalsIgnoreCase("MethodF")){
                return new Object[][] {
                        { "Guru99", "India" },
                        { "Krishna", "UK" },
                        { "Bhupesh", "USA" }
                    };
                    }
            
                else{
                return new Object[][] {
                	{  "Jignesh" ,"Canada" }, 
					{  "Patel" ,"Russia" }, 
					{  "bablai", "Japan" } 
                    };
                    }
            }
                @DataProvider(name="Test3")
            	public Object[][] getDataFromDataprovider2 (ITestContext c) {
            	Object[][] groupArray = null;
            		for (String group : c.getIncludedGroups()) {
            		if(group.equalsIgnoreCase("A")){
            			groupArray = new Object[][] { 
            					{ "Guru99", "India" }, 
            					{ "Krishna", "UK" }, 
            					{ "Bhupesh", "USA" } 
            				};
            		break;	
            		}
            			else if(group.equalsIgnoreCase("B"))
            			{
            			groupArray = new Object[][] { 
            						{  "Jignesh" ,"Canada" }, 
            						{  "Patel" ,"Russia" }, 
            						{  "bablai", "Japan" } 
            					};
            			}
            		break;
            	}
            	return groupArray;		
            	}

}            

