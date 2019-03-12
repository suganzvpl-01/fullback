package com.maveric.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MavericLoginPage {
	
	static By usernNameLoc = By.cssSelector("#LoginForm_username");
	static By pwdLoc = By.xpath("//input[@id='LoginForm_password']");
	static By submitLoc = By.name("yt0");
	static By invalidErrorLoc = By.xpath("//div[@id='LoginForm_password_em_']");
	
	public static void sendUserName(WebDriver driver,String userName)
	{
		WebElement userNameEle=driver.findElement(usernNameLoc);
		userNameEle.sendKeys(userName);
	}
	public static void sendPWD(WebDriver driver,String passWord)
	{
		WebElement userNameEle=driver.findElement(pwdLoc);
		userNameEle.sendKeys(passWord);
	}
	
	public static void loginClick(WebDriver driver)
	{
		WebElement submitEle=driver.findElement(submitLoc);
		submitEle.click();
	}
	public static String getInvalidErrorMessageAndWait(WebDriver driver,WebDriverWait wait)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(invalidErrorLoc));
		return driver.findElement(invalidErrorLoc).getText();		
	}
	
	
}
