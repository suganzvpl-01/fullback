package com.maveric.reference;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class BaseTest {
	
	/*@BeforeMethod
	public void setUp() {
		System.out.println("Setup");
	}
	@AfterMethod
	public void close() {
		System.out.println("Browser Closed");
	}
	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	@Test
	public void testCase2() {
		System.out.println("Test Case 2");
	}*/
	
	/*@Test
	public void testMethod2()
	{
		int[] num = {1,2,3,4};//single dimension array
		int[][] numMulti = {{1,2,3,4},{5,6},{7,8}};
		System.out.println(numMulti[0][3]); // 4
		System.out.println(numMulti[1][0]); // 5
		 
		int[][] numMult =new int[2][2];//{{0,0},{0,0}}
		numMult[0][0] = 1;
		numMult[0][1] = 2;
		
		System.out.println(numMult[0][1]);
		System.out.println(numMult.length);
		System.out.println(numMult[0].length);
		
	}*/
	
	@DataProvider(name="cred") // only with @DataProvider we can use by calling with positiveCredentials.
	public Object[][] positiveCredentials()
	{
		Object temp[][]= new Object[3][2];
		
		temp[0][0]="bbbb";
		temp[0][1]="hgfc";
		
		temp[1][0]="aaaa";
		temp[1][1]="hjgytfyt";
		
		temp[2][0]="cccc";
		temp[2][1]="gftdtrd";
		return temp;
		
	}
	
	
	@Test(dataProvider="cred")
	public void testMethod2(String userName,String passWord)
	{
		System.out.println("Test Mthod2 " + userName+passWord);
	}

}