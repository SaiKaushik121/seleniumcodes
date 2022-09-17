package SelPrac;

import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	public static void main(String[] args) throws Exception 
	{		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
			
		//Window
		//driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();   // open new tab
	
		
	//	Set<String> windowhandle = driver.getWindowHandles();
		//Iterator<String> it = windowhandle.iterator(); //Collection and generics
		
		//String parentwindow = it.next(); //parent
		//String childwindow = it.next(); //child  
 
//		driver.switchTo().window(childwindow);
		
	//	driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]//li[2]/a")).click(); // click on courses
		
		//driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("testing");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);

		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("testing2222");
		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
