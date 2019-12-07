package com.sause.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
		
		if(driver.getTitle().contains("Swag Labs"))
		    //Pass
		    System.out.println("Pass = Page title contains Sag Labs");
		else
		    //Fail
		    System.out.println("Fail = Page title doesn't contain Swag Labs");
		
		driver.quit();
		
				
	}


}
