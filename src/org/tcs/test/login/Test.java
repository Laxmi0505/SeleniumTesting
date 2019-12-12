package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("Greens");
	
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("java");
	}
	}

