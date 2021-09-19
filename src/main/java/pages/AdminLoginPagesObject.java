package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AdminLoginPagesObject {
	
	WebDriver driver = null;
	
	By text_user_name = By.xpath("(//input[@name = 'username'])");
	
	By text_password = By.xpath("(//input[@name = 'password'])");
	
	public AdminLoginPagesObject(WebDriver driver) { 
	
		this.driver = driver;
		
	}
	
	public void setUserName(String user_Name) { 
		
		driver.findElement(text_user_name).sendKeys(user_Name);
		
		
	}
	
	public void setPassword(String user_Password) { 
		
		driver.findElement(text_password).sendKeys(user_Password,Keys.ENTER);
		
		
	}

	
	

}
