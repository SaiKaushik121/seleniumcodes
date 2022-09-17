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
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

class urltesting
{
	String url,correcturl;
	public void urltest()
	{
		WebDriver driver = new ChromeDriver();
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
	}
}
class freshworks extends urltesting
{
	WebElement cookies;
	public void cookiestest()
	{
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")).click(); //freshworks image
		cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")); //cookies accept button
		cookies.click();
	}
}
class mousehover
{
	WebElement customer,support,m1,m2,m3,m4,m5;
	public void mousehovertest()
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		m1 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[1]/span")); // product
		m2 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/span")); // platform
		m3 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/span")); // company
		m4 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/span")); // resources 	
		m5 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[7]/span")); // language
		action.moveToElement(m1).pause(2000).moveToElement(m2).pause(2000).moveToElement(m3).pause(2000)
		.moveToElement(m4).pause(2000).moveToElement(m5).build().perform();
		customer = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[5]/a"));
		customer.click();//customer
		driver.navigate().back();

		support = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[6]/a"));
		support.click();
		driver.navigate().back();
	}
}
class regwhy
{
	public void regwhytest()
	{
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[1]")).click(); // register now button

		driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[2]")).click(); // why attend button
		Set<String> windowhandle = driver.getWindowHandles(); // getwindow handles of opened windows
		Iterator it = windowhandle.iterator();          
		String parentwindow = (String) it.next();       
		String childwindow = (String) it.next();
		String childwindow1 = (String)it.next();
		driver.switchTo().window(parentwindow);
	}
}
class solutioncust
{
	WebElement solcuscook,solcus;
	public void solcusttest()
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		solcus =  driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/a[1]"));// solutions for customers
		action.moveToElement(solcus).click(solcus).build().perform();

		solcuscook = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")); 
		solcuscook.click();// solutions for customer page cookie accept

		driver.navigate().back();
	}
}
class solutionsale
{
	WebElement solsale;
	public void solsaletest()
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		solsale = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/a[2]")); // solutions for sales
		action.moveToElement(solsale).click(solsale).perform();

		driver.navigate().back();
	}
}
class solutuionit
{
	WebElement solit,solitcook;
	public void solithtest()
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		solit = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/a[1]")); // solution for it department
		action.moveToElement(solit).click(solit).build().perform(); // moves to solution for it department button and clicks it

		solitcook = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		solitcook.click();

		driver.navigate().back();
	}
}
class solutionhr
{
	WebElement solhr;
	public void solhrtest()
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		solhr = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/a[2]"));    // solutions for hr
		action.moveToElement(solhr).click(solhr).build().perform();  // moves to solutions for hr and clicks it 

		driver.navigate().back();
	}
}
class banner
{
	WebElement b1,b2,b3;
	public void bannertest() 
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		b1 = driver.findElement(By.xpath("//*[@id=\"16361006216950\"]/div[2]/div/ol/li[1]"));
		b2= driver.findElement(By.xpath("//*[@id=\"16361006216950\"]/div[2]/div/ol/li[2]")); 
		b3 = driver.findElement(By.xpath("//*[@id=\"16361006216950\"]/div[2]/div/ol/li[3]"));

		action.click(b1).pause(2000).click(b2).pause(2000).click(b3).perform();
	}
}
public class Assignment2 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		urltesting obj =new urltesting();
		obj.urltest();
		
		freshworks obj1 = new freshworks();
		obj1.cookiestest();
		
		
		
		

	}
}
