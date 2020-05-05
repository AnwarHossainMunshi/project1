package com.facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNewours {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	//browser initialize

	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();//window maximize
	driver.get("http://newtours.demoaut.com");// open browser
	// type user name
	WebElement name=driver.findElement(By.xpath("//*[@name='userName']"));
	name.sendKeys("munshi.nyc@gmail.com");
	
	//type password
	WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
	password.sendKeys("shorna1995");
	
	// signin button
	WebElement signin=driver.findElement(By.xpath("//*[@type='image']"));
	signin.click();
	
	driver.close();
	
	
	
	
		
	
}



	
	
}

