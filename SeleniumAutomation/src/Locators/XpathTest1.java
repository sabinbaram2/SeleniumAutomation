package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("sabin2396");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Sabin@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]")).click();
	Thread.sleep(10000);
	
	
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Instagram")) {
		System.out.println("Pass: Homepage is displayed");
	}
	else {
		System.out.println("Fail: Homepage is not displayed");
	}
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(2000);
	driver.close();

	}

}
