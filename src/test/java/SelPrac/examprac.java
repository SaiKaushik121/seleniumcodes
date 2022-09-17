package SelPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class examprac
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium-apps.doselect.in/email-validation/index.html");
		
		driver.findElement(By.id("email")).sendKeys("someone@gmail.com");
		driver.findElement(By.id("btn")).click();
		
		
	}
}
