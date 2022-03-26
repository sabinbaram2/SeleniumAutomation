package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Calendar']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
