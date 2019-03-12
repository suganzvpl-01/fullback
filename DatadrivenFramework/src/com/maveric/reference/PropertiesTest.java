package com.maveric.reference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static Properties getPropertiesDetails(String fileNameWithPath) throws IOException {
		FileInputStream fileIn=new FileInputStream(fileNameWithPath);
		Properties prop=new Properties();
		prop.load(fileIn);
		return prop;		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		/*//example for try catch
		try {
			FileInputStream fileIn = new FileInputStream("Utilities1/data.properties");
			String[] names = {"James"};
			System.out.println(names[1]);
		} catch (Exception e) {
		//we can use Exception also which is a parent Class
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// this will run since we handled the error
		System.out.println("Test Checked");*/
		
		Properties prop = PropertiesTest.getPropertiesDetails("Utilities/data.properties");
		System.out.println(prop.getProperty("url"));
		
		
		
	}

}