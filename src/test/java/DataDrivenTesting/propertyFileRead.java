package DataDrivenTesting;

import java.io.FileInputStream;

import java.util.Properties;

public class propertyFileRead {

	public static void main(String[] args) throws Throwable {
		
		//1- open the file in java readable format - . specifies current project- which is understood by jvm
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");

		//2- create an object for properties class
		Properties p=new Properties();
		
		//3- load the fileInputStream to properties
		p.load(file);
		
		//4- use the key to get the values
		 Object value = p.getProperty("username");
		 Object value1 = p.getProperty("abc");
		 
		//5- use the value
		 System.out.println(value);
		 System.out.println(value1);
	}

}
