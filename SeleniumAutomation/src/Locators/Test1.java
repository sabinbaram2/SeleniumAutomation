package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapp.skillrary.com/login.php?type=login/");
	Thread.sleep(3000);
	driver.findElement(By.id("loginClick")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Return")).click();
	
	

	}

}
