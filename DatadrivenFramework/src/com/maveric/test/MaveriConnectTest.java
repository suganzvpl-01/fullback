package com.maveric.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maveric.pageobjects.MavericHomePage;
import com.maveric.pageobjects.MavericLoginPage;
import com.maveric.utilities.PropertiesHandler;


public class MaveriConnectTest {
	
		
	
	public void positiveCredentialCheck() throws IOException {
		//System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.firefox.bin", "path of your Firefox/chrome if other than program files");
		driver.manage().window().maximize();
		Properties prop=PropertiesHandler.getPropertiesDetails("Utilities/data.properties");
		driver.get(prop.getProperty("url"));
		WebElement userNameEle=driver.findElement(By.cssSelector("#LoginForm_username"));
		userNameEle.sendKeys(prop.getProperty("username"));
		WebElement pwdNameEle=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		pwdNameEle.sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.name("yt0")).click();
		
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='QMS']")));

		if(driver.getTitle().equals(prop.getProperty("title")))
		{
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		//this is normal, but for framework we need to divide later
		/*FileInputStream fileIn = new FileInputStream("Utilities/data.properties");
		Properties prop=new Properties();
		prop.load(fileIn);
		driver.get(prop.getProperty("url"));
		WebElement userNameEle=driver.findElement(By.cssSelector("#LoginForm_username"));
		userNameEle.sendKeys(prop.getProperty("username"));
		WebElement pwdNameEle=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		pwdNameEle.sendKeys(prop.getProperty("pwd"));
		
		driver.findElement(By.name("yt0")).click();
		// implicit wait example (only once it should be used as that will get applied for the entire page)
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//explicit Wait Example
				WebDriverWait wait = new WebDriverWait(driver, 50);
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='QMS']")));
		
		if(driver.getTitle().equals(prop.getProperty("title")))
		{
			System.out.println("Test Case Passed");
		}*/
	}
	
	public void inValidCredCheck() throws IOException {
		 	
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.firefox.bin", "path of your Firefox/chrome if other than program files");
		driver.manage().window().maximize();
		Properties prop=PropertiesHandler.getPropertiesDetails("Utilities/data.properties");
		driver.get(prop.getProperty("url"));
		WebElement userNameEle=driver.findElement(By.cssSelector("#LoginForm_username"));
		userNameEle.sendKeys(prop.getProperty("nusername"));
		WebElement pwdNameEle=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		pwdNameEle.sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.name("yt0")).click();
		
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='LoginForm_password_em_']")));
		String actualText = driver.findElement(By.id("LoginForm_password_em_")).getText();
		String expectedText = prop.getProperty("expectedtext");
			
		/*if((driver.findElement(By.id("LoginForm_password_em_")).getText()).equals(prop.getProperty("expectedtext")))
		{
			System.out.println(prop.getProperty("expectedtext"));
			System.out.println("Test Case Passed");			
		}
		else {
			System.out.println("Test Case Failed");
		}	*/
		Assert.assertEquals(actualText, expectedText,"Validation on NegativeCredentialsCheck");
	}
	
	public void positiveCredentialCheckwithPOM() throws IOException {

		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Properties prop=PropertiesHandler.getPropertiesDetails("Utilities/data.properties");
		
		driver.get(prop.getProperty("url"));
		String userName=prop.getProperty("username");
		String passWord=prop.getProperty("pwd");
		
		
		MavericLoginPage.sendUserName(driver, userName);
		MavericLoginPage.sendPWD(driver, passWord);
		MavericLoginPage.loginClick(driver);
		
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		String actualTitle=MavericHomePage.waitForQMSDisplayAndGetTitle(wait, driver);

		Assert.assertEquals(actualTitle,prop.getProperty("title") );
						
	}
	@Test
	public void negativeCredentialCheckwithPOM() throws IOException {

		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Properties prop=PropertiesHandler.getPropertiesDetails("Utilities/data.properties");
		
		driver.get(prop.getProperty("url"));
		String userName=prop.getProperty("nusername");
		String passWord=prop.getProperty("pwd");
		
		
		MavericLoginPage.sendUserName(driver, userName);
		MavericLoginPage.sendPWD(driver, passWord);
		MavericLoginPage.loginClick(driver);
		
		
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		String actualTitle=MavericLoginPage.getInvalidErrorMessageAndWait(driver, wait);

		Assert.assertEquals(actualTitle,prop.getProperty("expectedtext"));
						
	}

}
