package SelPrac;
import java.util.*;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandlings {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='openwindow']")).click();
		
		
		Set<String> windowhandle = driver.getWindowHandles();
		Iterator<String> it = windowhandle.iterator();
		
		String parentwindow = it.next();
		System.out.println(parentwindow);
		String childwindow = it.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[2]/a")).click();
		
	}

}
