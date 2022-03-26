package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXpath {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("sabin2396");
	driver.findElement(By.name("password")).sendKeys("Sabin@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]")).click();
	driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='_2dbep qNELH']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[contains(@class,'_7UhW9')])[76]")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Instagram")) {
		System.out.println("Pass: Homepage is displayed.");
	}
	else {
		System.out.println("Fail");
	}
	System.out.println(driver.getCurrentUrl());
	driver.close();

	}

}
