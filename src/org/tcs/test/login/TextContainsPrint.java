package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContainsPrint {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		WebElement para1 = driver.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated As ')]"));
		String txt1=para1.getText();
		System.out.println(txt1);
		
		WebElement para2 = driver.findElement(By.xpath("//p[contains(text(),' Learn ')]"));
		String txt2=para2.getText();
		System.out.println(txt2);
		
	}
}
