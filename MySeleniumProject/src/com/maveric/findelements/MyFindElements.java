package com.maveric.findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://connect.maveric-systems.com");
		
/*		// * can be used to find any Tag . //*[contains(text(),'Forgot')])
				WebElement forgotEle = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
				
				String link = forgotEle.getAttribute("href");
				System.out.println(link);
				
				String tagName = forgotEle.getTagName();
				System.out.println(tagName);
				
				String text = forgotEle.getText();
				System.out.println(text);
				*/
		
		WebElement userNameEle=driver.findElement(By.cssSelector("#LoginForm_username"));
		userNameEle.sendKeys("suganyasm");
		WebElement pwdNameEle=driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
		pwdNameEle.sendKeys("Maveric08");
		WebElement submitEle=driver.findElement(By.xpath("//input[@name='yt0']"));
		submitEle.click();
		
		//wait until QMS comes in Page source
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='QMS']")));
		
		List<WebElement> allATag=driver.findElements(By.tagName("a"));
		int noOfLinks = allATag.size();
		System.out.println(noOfLinks);
		
		
		
		/*for(int i = 0;i<noOfLinks;i++) {
			
			WebElement firstTag= allATag.get(i);
			System.out.println(firstTag);
			
			
			System.out.println(firstTag.getText());
			if (firstTag.getText().equals("QMS")) {
				firstTag.click();
				break;
			}
			
		}*/
		
		//foreach
		for(WebElement ele : allATag) {
			if(ele.getText().trim().equals("QMS"))
			{
				ele.click();
				break;
			}
			
		}
		
		
		
		
	}

}
