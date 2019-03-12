package com.maveric.externalsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		WebElement alertbox = driver.findElement(By.name("B1"));
		alertbox.click();
		Alert alertBox=driver.switchTo().alert();
		System.out.println(alertBox.getText());
		Thread.sleep(5000);
		//accept or dismiss will work for ok button popup.
		alertBox.dismiss();		
		
	}

}
