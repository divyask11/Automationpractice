package nov25_propertiefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class example1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*file path:from the root till the end 
		 * absolute path:\\C:\Users\Admin\eclipse-workspace\java\test_data\appdata.properties
		 * 
		 * relative path:start from anywhere
		 * .\java\test_data\appdata.properties
		 * where "." indicate current working directory
		 * string filepath=system.getproperties('user.dir")
		 * 
		 */
		
		//string filepath=systeam.getproperties(user.dir)\java\test_data\appdata.properties
		 //or
		
	String filePath="C:\\Users\\Admin\\eclipse-workspace\\java\\test_data\\appdata.properties";
	//	or 
		
		
		//1.define file path
//	String filePath=".\\test_data\\appdata.properties";

	//2. Create an instance of FileInputStream class and pass the property file location to its constructor.

	FileInputStream fis=new FileInputStream(filePath);
	
//	3. Create an instance of Properties class

	Properties pro=new Properties();
	
	//4. With the help of properties reference variable call load() properties class and pass
   
	pro.load(fis);
	
	String appurl=pro.getProperty("applicationURl");
	System.out.println(appurl);
		
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));

		System.out.println(pro.getProperty("mobilenumber"));
		System.out.println(pro.getProperty("emailId"));


		
	}

}










/*
Steps to read data from property file:
1. First find the location where you have stored property file
2. Create an instance of FileInputStream class and pass the property file location to its constructor.
3. Create an instance of Properties class
4. With the help of properties reference variable call load() properties class and pass
     FileInputStream class reference to this method
5. Call getProperty(key) of Properties class to read data from property file
*/