package org.tcs.test.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {
	
	 static int keyInput[] = {KeyEvent.VK_DOWN, KeyEvent.VK_ENTER};
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement btnGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac=new Actions(driver);
		ac.contextClick(btnGmail).perform();
			
		Robot r = new Robot();
		
		for(int i=0;i<keyInput.length;i++) {
		r.keyPress(keyInput[i]);
		}
}
}
