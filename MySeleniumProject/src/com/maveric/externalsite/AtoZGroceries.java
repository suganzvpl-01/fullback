package com.maveric.externalsite;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AtoZGroceries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		/*driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Suganya");
		driver.findElement(By.id("ap_email")).sendKeys("test@test.com");
		driver.findElement(By.id("ap_password")).sendKeys("test_0123");
		driver.findElement(By.id("continue")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("auth-phoneNumber-missing-alert")));
		System.out.println(driver.findElement(By.id("auth-phoneNumber-missing-alert")).getText());*/
		Actions action = new Actions(driver);
		
		/*//always compile and run with build+perform
		// x y location try
		//action.moveToElement(driver.findElement(By.xpath("//span[text()='Category']"))).build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='TV, Appliances, Electronics']")));
		Point p= driver.findElement(By.xpath("//span[text()='Category']")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		action.moveByOffset(193, 76).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='TV, Appliances, Electronics']")));
		action.moveToElement(driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"))).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Speakers']")));
		//driver.findElement(By.xpath("//span[text()='Speakers']")).click();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Speakers']"))).build().perform();*/

		// build and perform is for whole.. that click is relevant for speaker. so other function like double click should be written near the element which you want
		/*action.moveToElement(driver.findElement(By.xpath("//span[text()='Category']"))).pause(2000)
		.moveToElement(driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"))).pause(Duration.ofSeconds(2))
		.moveToElement(driver.findElement(By.xpath("//span[text()='Speakers']"))).click().build().perform();*/
		
		
		//using JavaScript
		WebElement spkEle=driver.findElement(By.xpath("//span[text()='Speakers']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",spkEle );
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		
	}

}
