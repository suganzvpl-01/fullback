package com.maveric.externalsite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim.height);
		System.out.println(dim.width);
		
		
		Dimension setDim = new Dimension(dim.width/2, dim.height/2); 
		driver.manage().window().setSize(setDim);
		
		
		
		//explicit Wait Example
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// implicit wait example (only once it should be used as that will get applied for the entire page)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		
		/*System.out.println(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[2]/td[2]")).getText());*/
		
		/*List<WebElement> rowsEle = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int noOfRows=rowsEle.size();
		//System.out.println(noOfRows);
		
		List<WebElement> colsEle = driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td"));
		int noOfCols=colsEle.size();
		//System.out.println(noOfCols);
		
		//driver.findElement(By.xpath("//table[@id='example']/tbody/tr[4]/td[1]")).click();
				
		for(int i=1;i<=noOfRows;i++) {
			//System.out.println("I Value Is "+i+" .");
			WebElement namesEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]"));
			System.out.println(namesEle.getText());
			if (namesEle.getText().trim().equals("Bradley Greer")) {
				driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
				break;
			}
		}
		int totVal = 0;
		for(int i=1;i<=noOfRows;i++) {
			//System.out.println("I Value Is "+i+" .");
			WebElement salEle = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]"));
			//System.out.println(namesEle.getText());
			//other way
			//System.out.println(salEle.getText().replace("$","").replace(",", ""));
			
			 String salValue= salEle.getText();
			 salValue= salValue.replace("$", "");
			 salValue= salValue.replace(",", "");
			//System.out.println(salValue);
			
			//Calculating the result by changing into int
			totVal=totVal+Integer.parseInt(salValue);
			System.out.println(totVal);
			}
		
		System.out.println("Total = "+totVal);
*/		
		WebElement tableEle=driver.findElement(By.id("example"));
		WebElement tbodyEle= tableEle.findElement(By.tagName("tbody"));
		List<WebElement> rowsEle= tbodyEle.findElements(By.tagName("tr"));
		
		System.out.println(rowsEle.size());
		for(WebElement row: rowsEle)
		{
			System.out.println(row.getText());
			List<WebElement> colsEle = row.findElements(By.tagName("td"));
			for (WebElement col:colsEle) {
				System.out.println(col.getText());
			}
				
			
		}

}
}
