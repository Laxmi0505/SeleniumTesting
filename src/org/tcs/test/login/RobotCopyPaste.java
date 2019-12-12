package org.tcs.test.login;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotCopyPaste {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		WebElement txtUSer = driver.findElement(By.id("email"));
		txtUSer.sendKeys("Greens");
			Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_A);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_A);
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_X);
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_X);
						
				WebElement txtPass = driver.findElement(By.id("pass"));
					txtPass.click();
						r.keyPress(KeyEvent.VK_CONTROL);
						r.keyPress(KeyEvent.VK_V);
				
						r.keyRelease(KeyEvent.VK_CONTROL);
						r.keyRelease(KeyEvent.VK_V);
	}
}
