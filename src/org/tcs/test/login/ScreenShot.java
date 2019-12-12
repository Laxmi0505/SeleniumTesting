package org.tcs.test.login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();
		
		WebElement javaTraining = driver.findElement(By.xpath("//span[text()='Java Training ']"));
		ac.moveToElement(javaTraining).perform();
		
		WebElement coreJavaTraining = driver.findElement(By.xpath("//span[text()='Core Java Training']"));
		coreJavaTraining.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d=new File("D:\\Selenium\\Day_8.jpg");
		
		FileUtils.copyFile(s,d);
}
}
