package SelPrac;
import java.time.Duration;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseHoverMenu 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url,correcturl;

		url = "https://www.freshworks.com/";
		driver.get(url); // opens the url
		correcturl = driver.getCurrentUrl(); //gets the current url

		if(url.equals(correcturl)) // checks for correct url and incorrect url
		{
			System.out.println("Correct url is openend");
		}
		else
		{
			System.out.println("Incorrect url");
		}
		
		driver.manage().window().maximize();

	}

}
