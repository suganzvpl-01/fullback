package com.maveric.externalsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbusLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("signInLink")).click();
		
		WebElement newFrame= driver.findElement(By.xpath("//iframe[@class ='modalIframe']"));
		driver.switchTo().frame(newFrame);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mobileNoInp")));
		driver.findElement(By.id("mobileNoInp")).sendKeys("9500128693");
		driver.findElement(By.xpath("//div[text()='Generate OTP']")).click();
	}

}
