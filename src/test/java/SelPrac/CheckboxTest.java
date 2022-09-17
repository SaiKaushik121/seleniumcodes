package SelPrac;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTest
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		String linksite = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(linksite);


		List<WebElement> radiosize = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println( driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).isDisplayed());        
		System.out.println(radiosize.size());

	}

}
