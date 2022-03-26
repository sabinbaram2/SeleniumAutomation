package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://paytm.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
	
	Set<String> child = driver.getWindowHandles();
	for(String b:child)
	{
		driver.switchTo().window(b);
	}
	driver.findElement(By.xpath("//span[text()='Games']")).click();
	
	driver.quit();
	}

}
