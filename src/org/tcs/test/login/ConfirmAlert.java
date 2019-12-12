package org.tcs.test.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.dismiss();
}
}