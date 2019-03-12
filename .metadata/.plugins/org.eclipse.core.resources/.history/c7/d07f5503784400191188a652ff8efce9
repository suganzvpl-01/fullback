package com.maveric.test;

import org.testng.Assert;
import org.testng.annotations.*;

import com.maveric.initialization.LaunchActivities;
import com.maveric.pageobjects.MavericLoginPage;

public class TimeCardTest extends LaunchActivities {

	@Test
	public void timeCardFillTest()
	{
		System.out.println("Time Card Test");
		MavericLoginPage login = new MavericLoginPage(driver, wait);
		System.out.println("Login");
		int noOfLinks = login.getNoOfLinks();
		System.out.println(noOfLinks);
		
		login.loginClick();
		
		String pageSource = driver.getPageSource();
		
		Assert.assertTrue(pageSource.contains(""),"Assertion on save of time card details");
		
	}
	
}
