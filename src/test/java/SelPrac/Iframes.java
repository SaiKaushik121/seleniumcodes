package SelPrac;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Iframes 
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
		driver.get(url);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept(); //handling javascript alert 
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}
}
