package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIdPwd {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("gayulaxmi");
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("loveablelifee");
	
	Thread.sleep(2000);
	
	//WebElement btnLogIn = driver.findElement(By.xpath("//input[@type='submit']"));
	//btnLogIn.click();
	
	//txtUser.getText();
	//System.out.println(txtUser);
	
	//txtPass.getText();
	//System.out.println(txtPass);
	
	String fbId=txtUser.getAttribute("value");
	System.out.println(fbId);
	
	String fbPwd=txtPass.getAttribute("value");
	System.out.println(fbPwd);

}
	
}
