package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMMT {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//div[@class='landingContainer'])[1]")).click();
	driver.findElement(By.id("departure")).click();
	driver.findElement(By.xpath("//p[text()='19']")).click();
	
	WebElement ele1 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	ele1.sendKeys("Ba");
	List<WebElement> ele2 = driver.findElements(By.xpath("//p[text()='Bahrain, Bahrain']"));
	System.out.println(ele2.size());
	for(WebElement b:ele2)
	{
		System.out.println(b.getText());
	}
	}
	

}
