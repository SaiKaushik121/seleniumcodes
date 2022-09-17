package SelPrac;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RightClick
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");

		WebElement  RightClick = driver.findElement(By.xpath("//*[@id=\"logo-events\"]/h2/a"));
		
		Actions action =new Actions(driver);
		action.contextClick(RightClick).perform();	
	}

}
