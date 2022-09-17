package SelPrac;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		String linksite = "https://courses.rahulshettyacademy.com/";
		driver.get(linksite);
	    List<WebElement> alllinks = driver.findElements(By.tagName("a")); // list is used for findElements
	    System.out.println("Total Links Present are : "+alllinks.size());
	    for(int i=0;i<alllinks.size();i++)
	   {
	    	System.out.println("all links in the page are "+ alllinks.get(i).getAttribute("href"));
	   }
	}
}
