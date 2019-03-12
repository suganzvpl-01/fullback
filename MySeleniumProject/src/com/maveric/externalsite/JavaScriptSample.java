package com.maveric.externalsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://account.magento.com/customer/account/create/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('firstname').value='Suganya';");
		
		String text=js.executeScript("return document.getElementsByName('country')[0].options[5].innerText;").toString();
		System.out.println(text);
		
	}

}
