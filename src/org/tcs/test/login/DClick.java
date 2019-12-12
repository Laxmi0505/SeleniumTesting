package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DClick {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Greens");
		
		Actions ac=new Actions(driver);
		ac.doubleClick(txtUser).perform();
		
		String txtId=txtUser.getAttribute("value");
		System.out.println(txtId);
	}
}
