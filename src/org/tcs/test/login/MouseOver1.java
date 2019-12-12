package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.sprint.com/");
	
	WebElement mySprint = driver.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[4]"));
	
	Actions ac=new Actions(driver);
	ac.moveToElement(mySprint).perform();
	
	Thread.sleep(2000);
	
	WebElement payBill = driver.findElement(By.xpath("(//a[@class='js-nav-link'])[39]"));
	payBill.click();
}
	
}
