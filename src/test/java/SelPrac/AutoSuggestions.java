package SelPrac;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AutoSuggestions 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		String linksite = "https://www.google.com/";
		driver.get(linksite);
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.click();
		Thread.sleep(1000);
		search.sendKeys("testing");
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		driver.findElements(By.tagName("a"));
	}

}
