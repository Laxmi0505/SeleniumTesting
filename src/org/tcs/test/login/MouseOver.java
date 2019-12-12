package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://greenstech.in/selenium-course-content.html");

WebElement txtCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));

//Thread.sleep(2000);

Actions ac=new Actions(driver);
ac.moveToElement(txtCourse).perform();

//Thread.sleep(2000);

WebElement txtSoftTest = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));

ac.moveToElement(txtSoftTest).perform();

WebElement txtQTP = driver.findElement(By.xpath("//span[text()='QTP Training']"));

txtQTP.click();
}
}
