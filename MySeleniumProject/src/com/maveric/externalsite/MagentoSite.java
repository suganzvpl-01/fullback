package com.maveric.externalsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		//WebElement myAccountEle = driver.findElement(By.xpath("//a[@data-adobe-name='Header|GlobalNav|MyAccountClick']"));
		//WebElement myAccountEle = driver.findElement(By.xpath("//span[text()='My Account']"));
		WebElement myAccountEle = driver.findElement(By.xpath("//span[text()='My Account']/ancestor::a"));
		myAccountEle.click();
		/*WebElement registerEle = driver.findElement(By.xpath("//span[text()='Register']/ancestor::button"));
		registerEle.click();
		driver.findElement(By.id("firstname")).sendKeys("Suganya");
		//driver.findElement(By.)
*/		
		driver.findElement(By.name("login[username]")).sendKeys("test@test.com");
		driver.findElement(By.name("login[password]")).sendKeys("Morenike5");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Invalid login or password.']")).getText());		
	}

}
