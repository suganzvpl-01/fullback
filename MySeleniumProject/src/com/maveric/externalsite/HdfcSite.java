package com.maveric.externalsite;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HdfcSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 50);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//using Name
		//driver.switchTo().frame("login_page");
		//using index
		//driver.switchTo().frame(0);
		
		// one more way to go to frame
		WebElement newFrame= driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(newFrame);
		
		WebElement custId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		custId.sendKeys("38150233");
		
		
		WebElement custContinue = driver.findElement(By.xpath("//img[@alt ='continue']/ancestor::a"));
		custContinue.click();
		
		//now coming back to original
		driver.switchTo().defaultContent();
		

		
	
		/*Set<String> allHdfcLink = driver.getWindowHandles();
		for(String currValu : allHdfcLink)
		{
			System.out.println(currValu);
			
			driver.switchTo().window(currValu);
			
			String title = driver.getTitle();
			System.out.println(title);
			
			if (title.contains("Welcome to HDFC Bank NetBanking"))
			{
				break;
			}
					
		}*/

	}

}
