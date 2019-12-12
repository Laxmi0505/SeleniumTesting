package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/?stype=lo&jlou=AffmP2QyxZ7WECKzb2qxjLHw993K-DCxvpYU2T87IfPqbFDdsRvrZGbTecqUGTvCa8wTG8zAkNRDfTe4y66_W4zPNNXtz4LwGNgdAhZ0R2FMWg&smuh=22013&lh=Ac-72sX99c5qLOcE");
	
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("gayulaxmi");
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("loveablelifee");
	
	Thread.sleep(2000);
	
	WebElement btnLogIn = driver.findElement(By.xpath("//input[@type='submit']"));
	btnLogIn.click();
	
	//WebElement btnNext = driver.findElement(By.id("u_0_2"));
	//btnNext.click();
	
	//Thread.sleep(2000);
	//WebElement txtPass = driver.findElement(By.name("password"));
	//txtPass.sendKeys("laxmi");
	
	//driver.close();
	
	//driver.quit();
	
	//String attr=txtUser.getAttribute("id");
	//System.out.println(attr);
	
	//WebElement btnLogin = driver.findElement(By.xpath("//span[@class='Next']"));
	//btnLogin.click();
}
}
