package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 = driver.findElement(By.id("credit2"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement src2 = driver.findElement(By.id("fourth"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement src3 = driver.findElement(By.id("credit1"));
		WebElement dest3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		//WebElement src4 = driver.findElement(By.id("fourth"));
		WebElement dest4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src1, dest1).perform();
		ac.dragAndDrop(src2, dest2).perform();
		ac.dragAndDrop(src3, dest3).perform();
		ac.dragAndDrop(src2, dest4).perform();
	}
}
