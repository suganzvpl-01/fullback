package com.maveric.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestCopyWithXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");*/
		
		/*FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");*/
		
		/*WebDriver driver=new InternetExplorerDriver(); 
		driver.get("http://google.co.in");*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://connect.maveric-systems.com");
		
		
		/*String myTitle=driver.getTitle();
		System.out.println("Title of the page\n"+myTitle);

		String pageSource = driver.getPageSource();
		if(pageSource.contains("Login")) {
			System.out.println("Test Passed");
		}*/
		/*driver.findElement(By.id("LoginForm_username")).sendKeys("suganyasm");
		driver.findElement(By.id("LoginForm_password")).sendKeys("Maveric2810");
		driver.findElement(By.name("yt0")).click();*/
		WebElement userNameEle=driver.findElement(By.xpath("//input[@id='LoginForm_username']"));
		userNameEle.sendKeys("suganyasm");
		WebElement pwdNameEle=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		pwdNameEle.sendKeys("Maveric08");
		WebElement submitEle=driver.findElement(By.xpath("//input[@name='yt0']"));
		submitEle.click();
		
		//wait until QMS comes in Page source
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='QMS']")));
		
		// wait until QMS comes in real page
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("QMS"))));
		
		String title = driver.getTitle();
		System.out.println(title);
		//Implicit wait is 0 Second, hence failing without wait
		//Thread.sleep(10000); // it will stop if any exception
		WebElement qmsLink=driver.findElement(By.xpath("//a[text()='QMS']"));
		qmsLink.click();
//		WebElement qmsLink1=driver.findElement(By.xpath("//a[text()='QMS']"));
//		qmsLink1.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@id='menu-treeview']")));
		
		//Maveric Systems Ltd. - Menu
		String expTitle = "Maveric Systems Ltd. - Menu";
		String myTitle=driver.getTitle();
		System.out.println(myTitle);
		if(myTitle.equals(expTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed'");
		}
		
		
		//WebElement welEle=driver.findElement(By.xpath("//a[contains(text(),'Welcome')]"));
		WebElement welEle=driver.findElement(By.xpath("//a[starts-with(text(),'Welcome')]"));
		WebElement logoutEle=driver.findElement(By.xpath("//a[text()='Logout ']"));
		// instead of contains replace with starts-with = //a[starts-with(text(),'Welcome')]
		Actions action = new Actions(driver);
		
		/*action.moveToElement(welEle).build().perform();
				
		
		//welEle.click();
		
		logoutEle.click();*/
		action.moveToElement(welEle).pause(2000).
		moveToElement(logoutEle).click().build().perform();	
		
	}

}
