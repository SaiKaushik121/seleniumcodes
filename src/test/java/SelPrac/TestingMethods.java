package SelPrac;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingMethods {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String weburl = "https://www.sugarcrm.com/au/request-demo/";
		driver.get(weburl);
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		//WebElement set = select.getFirstSelectedOption();
		select.selectByValue("level1");
		
		select.selectByVisibleText("1 - 10 employees");
		
		select.selectByIndex(0);
	
		
	}

}
