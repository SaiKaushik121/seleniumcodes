package SelPrac;
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

public class practice 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		//searchbox.sendKeys("Testing");
		//searchbox.sendKeys(Keys.DOWN);
		//searchbox.sendKeys(Keys.ENTER);
		
		//OR
		
		
		Actions action = new Actions(driver);
	    action.sendKeys(searchbox, "Testing").sendKeys(searchbox, Keys.DOWN).sendKeys(searchbox,Keys.ENTER).build().perform();

	}

}
