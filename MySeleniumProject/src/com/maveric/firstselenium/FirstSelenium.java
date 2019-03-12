package com.maveric.firstselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		//ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com");
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		String pageSource = driver.getPageSource();
		System.out.println("PAGESOURCE\n"+pageSource);
		String myTitle=driver.getTitle();
		System.out.println("Title of the page\n"+myTitle);
		
	}

}
