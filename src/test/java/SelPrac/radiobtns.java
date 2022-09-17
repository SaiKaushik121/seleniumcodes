package SelPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobtns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		String linksite = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.get(linksite);


		List<WebElement> radiosize = driver.findElements(By.xpath("//*[@type='radio']"));
		driver.findElement(By.xpath("//*[@value= 'radio1']  ")).click();
		System.out.println( driver.findElement(By.xpath("//*[@value= 'radio1']")).isSelected());        
		System.out.println(radiosize.size());

	}

}
