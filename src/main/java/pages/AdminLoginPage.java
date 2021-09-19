package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
	
	private static WebElement element = null;
	
	public static WebElement textBoxUsername(WebDriver driver) { 
		
	  element =	driver.findElement(By.xpath("(//input[@name = 'username'])"));
	  
	  return element;

		
	}
	
	public static WebElement adminPassword(WebDriver driver) { 
		
		  element =	driver.findElement(By.xpath("(//input[@name = 'password'])"));

		  
		  return element;

			
		}

	
}
