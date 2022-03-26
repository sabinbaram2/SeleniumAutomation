package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("8093522569");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("allthebest");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();

	}

}
