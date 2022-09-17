package SelPrac;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Keyboard 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]//div[5]/div[6]/pre"));
		WebElement Destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[6]"));
	
		Actions action = new Actions(driver);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(Destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
	}

}
