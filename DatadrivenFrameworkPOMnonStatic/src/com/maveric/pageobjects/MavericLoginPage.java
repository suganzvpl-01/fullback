package com.maveric.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MavericLoginPage {
	
	By usernNameLoc = By.cssSelector("#LoginForm_username");
	By pwdLoc = By.xpath("//input[@id='LoginForm_password']");
	By submitLoc = By.name("yt0");
	By invalidErrorLoc = By.xpath("//div[@id='LoginForm_password_em_']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public MavericLoginPage(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;
	}
		
	public void sendUserName(String userName)
	{
		WebElement userNameEle=driver.findElement(usernNameLoc);
		userNameEle.sendKeys(userName);
	}
	public void sendPWD(String passWord)
	{
		WebElement userNameEle=driver.findElement(pwdLoc);
		userNameEle.sendKeys(passWord);
	}
	
	public void loginClick()
	{
		WebElement submitEle=driver.findElement(submitLoc);
		submitEle.click();
	}
	public String getInvalidErrorMessageAndWait()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(invalidErrorLoc));
		return driver.findElement(invalidErrorLoc).getText();		
	}
	
	
}
