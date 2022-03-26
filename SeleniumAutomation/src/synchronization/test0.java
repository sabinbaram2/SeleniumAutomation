package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("sabin2396");
		driver.findElement(By.name("password")).sendKeys("Sabin@123");
		
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		
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
