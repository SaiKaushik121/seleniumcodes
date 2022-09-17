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

public class Assignment 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		WebElement b1,b2,b3,solit,solitcook,solhr,solcuscook,cookies,solcus,solsale,m1,m2,m3,m4,m5,customer,support,virtualpass,ddown,country;
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
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/a/img")).click(); //freshworks image
		cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")); //cookies accept button
		cookies.click();

		//menu bar
		m1 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[1]/span")); // product
		m2 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[2]/span")); // platform
		m3 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/span")); // company
		m4 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[4]/span")); // resources 	
		m5 = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[7]/span")); // language

		action.moveToElement(m1).pause(2000).moveToElement(m2).pause(2000).moveToElement(m3).pause(2000)
		.moveToElement(m4).pause(2000).moveToElement(m5).build().perform();

		customer = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[5]/a"));
		customer.click();;//customer
		driver.navigate().back();

		support = driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[6]/a"));
		support.click();
		driver.navigate().back();

		//register and why us button
		driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[1]")).click(); // register now button

		driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[2]")).click(); // why attend button

		Set<String> windowhandle = driver.getWindowHandles(); // getwindow handles of opened windows
		Iterator it = windowhandle.iterator();          
		String parentwindow = (String) it.next();       
		String childwindow = (String) it.next();
		String childwindow1 = (String)it.next();


		driver.switchTo().window(parentwindow);
		// sales and customer

		solcus =  driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/a[1]"));// solutions for customers
		action.moveToElement(solcus).click(solcus).build().perform();

		solcuscook = driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")); 
		solcuscook.click();// solutions for customer page cookie accept


		driver.navigate().back();

		solsale = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/a[2]")); // solutions for sales
		action.moveToElement(solsale).click(solsale).perform();

		driver.navigate().back();

		//it and hr

		solit = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/a[1]")); // solution for it department
		action.moveToElement(solit).click(solit).build().perform(); // moves to solution for it department button and clicks it

		solitcook = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		solitcook.click();

		driver.navigate().back();

		solhr = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/a[2]"));    // solutions for hr
		action.moveToElement(solhr).click(solhr).build().perform();  // moves to solutions for hr and clicks it 

		driver.navigate().back();


		b1 = driver.findElement(By.xpath("//*[@id=\"39276506840160\"]/div[2]/div/ol/li[1]"));
		b2= driver.findElement(By.xpath("//*[@id=\"39276506840160\"]/div[2]/div/ol/li[2]")); 
		b3 = driver.findElement(By.xpath("//*[@id=\"39276506840160\"]/div[2]/div/ol/li[3]"));

		action.click(b1).pause(2000).click(b2).pause(2000).click(b3).perform();


		driver.switchTo().window(childwindow1); //register now

		virtualpass = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[1]/div[5]/div/div/div/a")); //virtual pass
		action.moveToElement(virtualpass).click(virtualpass).build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"56aeaca6-a0ad-4548-8afc-94d8d4361ba1\"]")).sendKeys("firstname");//first name
		driver.findElement(By.xpath("//*[@id=\"cfc98829-80b7-41b6-82b5-b968d43ef1c1\"]")).sendKeys("lastname");//last name
		driver.findElement(By.xpath("//*[@id=\"ff919d05-4281-4d9c-aa0d-82e3722d580d\"]")).sendKeys("testing123@gmail.com");// email id
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		ddown = driver.findElement(By.xpath("//*[@id=\"RegistrationType\"]")); //drop down
		Select select = new Select(ddown);
		select.selectByIndex(1);
		Thread.sleep(5000);
	
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id=\"032e80c1-f29f-44e6-af13-a89e53906422\"]")).sendKeys("123455779"); // mobilenumber
		

		driver.findElement(By.xpath("//*[@id=\"227f50d0-f65b-4a72-9a4f-5060ea05f6ab\"]")).sendKeys("Capgemini"); //company
		
		
		driver.findElement(By.xpath("//*[@id=\"228cc308-a4d9-4212-8454-8407dd578c3d\"]")).sendKeys("Mr"); //title
	

		country = driver.findElement(By.xpath("//*[@id=\"226424b4-1704-4ea3-90a9-b223ab7ff712\"]")); //country drop down
		Select selectcountry = new Select(country);
		selectcountry.selectByVisibleText("India");
		
		
		driver.findElement(By.xpath("//*[@id=\"agreementText_0\"]")).click(); // terms and conditions check box
		

		driver.findElement(By.xpath("//*[@id=\"forward\"]")).click(); // clicks on next				
		
		driver.findElement(By.cssSelector("#forward")).click();//clicks next on 2nd page
		
		driver.findElement(By.xpath("//*[@id=\"complete\"]")).click(); //submit
	}
}
