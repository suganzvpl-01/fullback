package com.maveric.externalsite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiplePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		/*WebElement applyCc = driver.findElement(By.xpath("//a[@title='APPLY FOR CREDIT CARDS']"));
		applyCc.click();
		Thread.sleep(5000);
		//closes the main page
		//driver.close();
				
		//closes the full chrome + its process also
		//driver.quit();
		
		//getting sesssion id
		String sessId=driver.getWindowHandle();
		System.out.println(sessId);
		System.out.println("--------------------");
		
		Set<String> sessAllId = driver.getWindowHandles();
		for(String sessValu : sessAllId)
		{
			System.out.println(sessValu);
			
			driver.switchTo().window(sessValu);
			
			String title = driver.getTitle();
			System.out.println(title);
			
			if (title.contains("Credit Card Application"))
			{
				break;
			}
					
		}
		WebElement fuelElemtn=driver.findElement(By.linkText("Fuel"));
		fuelElemtn.click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(sessId);
		String titleCheck = driver.getTitle();
		System.out.println(titleCheck);*/
		
		
	}
	

}
