package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.partialLinkText("Forgotten")).click();
	driver.findElement(By.id("identify_email")).sendKeys("8093522569");
	driver.findElement(By.name("did_submit")).click();
	}

}
