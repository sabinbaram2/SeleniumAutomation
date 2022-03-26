package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("CORE JAVA FOR SELENIUM");
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	driver.findElement(By.xpath("(//a[contains(text(),'Core')])[2]")).click();
	driver.findElement(By.xpath("//button[text()='Accept']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@class='play-icon']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
	driver.switchTo().defaultContent();
	
	
	driver.close();
	

	}

}
