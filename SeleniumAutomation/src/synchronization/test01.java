package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test01 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement username = driver.findElement(By.name("username"));
	w.until(ExpectedConditions.visibilityOf(username)).sendKeys("sabin2396");
	
	WebElement password=driver.findElement(By.name("password"));
	w.until(ExpectedConditions.visibilityOf(password)).sendKeys("Sabin@123");
	
	WebElement login= driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[2]"));
	w.until(ExpectedConditions.elementToBeClickable(login)).click();
	
	String title = driver.getTitle();
	w.until(ExpectedConditions.titleContains("Instagram"));
	
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
