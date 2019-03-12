package com.maveric.externalsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 50);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement searchText=driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		
		action.moveToElement(searchText)
		.pause(2000).keyDown(Keys.SHIFT).sendKeys("uppercase")
		.keyUp(Keys.SHIFT).pause(2000).build().perform();
		
		for (int i=1;i<=4;i++) {
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		action.sendKeys(Keys.ENTER).build().perform();
		
	}

}
