package SelPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetailLoginTest 
{
	public static String browser = "Chrome";
	
	public static void main(String[] args)throws Exception
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver",  "C:\\SeleniumChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		String LoginURL = "http://retailm1.upskills.in/admin/index.php?route=common/login";
		
		driver.get(LoginURL);
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin@123");		
		driver.findElement(By.cssSelector("#content > div > div > div > div > div.panel-body > form > div.text-right > button")).click();
		driver.findElement(By.id("button-menu")).click();
		driver.findElement(By.cssSelector("#menu-catalog > a > span")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-catalog\"]/ul/li[1]/a/text()")).click();
		
		
		
		
	}

}
