package org.tcs.test.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectGetOptions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement ddnMonth = driver.findElement(By.id("month"));
	
	Select s=new Select(ddnMonth);
	
	List<WebElement> emp = s.getOptions();
	
	for(WebElement x:emp) {

	String at = x.getAttribute("value");
	System.out.println(at);
	}	
}
}
