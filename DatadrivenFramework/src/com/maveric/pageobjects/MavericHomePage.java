package com.maveric.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MavericHomePage {
	static By qmsLoc= By.xpath("//a[text()='QMS']");
	
	public static String waitForQMSDisplayAndGetTitle(WebDriverWait wait,WebDriver driver)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(qmsLoc));		
		return driver.getTitle();
	}
	/*public static String getTitle(WebDriver driver) {
		String actualText=driver.getTitle();
		return actualText;
	}*/
}
