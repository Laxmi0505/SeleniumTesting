package org.tcs.test.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\JavaClass\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//To launch the flipkart url
driver.get("http://www.flipkart.com/");

//To get the current url
String url=driver.getCurrentUrl();
System.out.println(url);

//To get the title
String title=driver.getTitle();
System.out.println(title);
}
}
