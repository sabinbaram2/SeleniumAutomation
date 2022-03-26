package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("8093522569");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("allthebest");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String acttitle = driver.getTitle();
	System.out.println(acttitle);
	if(acttitle.equals("Facebook"))
	{
		System.out.println("Pass:Homepage is displayed");
	}
	else {
		System.out.println("Fail: Homepage is not displayed");
	}
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.close();
	}

}
