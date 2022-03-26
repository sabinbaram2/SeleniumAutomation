package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActions {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	
	driver.findElement(By.xpath("//a[text()='login']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@class='userAuth-card']"));
	
	driver.findElement(By.id("userName")).sendKeys("7008637848");
	driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-delete-sign fnt-22')]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.name("keyword")).sendKeys("Shoes");
	driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-search-under-catagory lfloat')]")).click();
	driver.findElement(By.name("keyword")).clear();
	
	Thread.sleep(3000);
	
	driver.close();
	
	

	}

}
