package operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readobject {

	
		  Properties read = new Properties();
public Properties getObjectRepository() throws IOException {
		        //Read object repository file
	InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\Objectrepo\\repo1.properties"));
		        //load all objects
		   read.load(stream);
		        return read;
		    
	}
}