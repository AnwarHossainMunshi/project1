package com.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselogin {
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

	// Initialize browser
	WebDriver driver=new ChromeDriver();//upcasting polymorphism
	// Maximize browser
	driver.manage().window().maximize();
	
	// Open facebook
	driver.get("http://www.facebook.com");//get()method
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("jamil_aaahmed@yahoo.com");
	WebElement email=driver.findElement(By.xpath("//*[@type='email']"));
	email.sendKeys("jamil_aaahmed@yahoo.com");
	WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
     password.sendKeys("Shorna@1995");
     
     WebElement signinbtn=driver.findElement(By.xpath("//*[@value='Log In']"));
     signinbtn.click();
     //close browser

//driver.quit();
     
	
	
	
}
}
