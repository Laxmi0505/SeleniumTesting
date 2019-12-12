package org.tcs.test.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPhoneList {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement searchProduct = driver.findElement(By.name("q"));
	searchProduct.sendKeys("iphone in mobiles");
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	List<WebElement> iPhoneList = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	for(WebElement x:iPhoneList) {
		String phoneList = x.getText();
		System.out.println(phoneList);
	}
}	
}
