package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[id='loginClick']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='password']")).sendKeys("user");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[class='login_Btn']")).click();
	
	}

}
