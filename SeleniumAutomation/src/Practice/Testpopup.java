package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testpopup {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
	Actions a= new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	
	WebElement ele1 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	Actions a1= new Actions(driver);
	a1.doubleClick(ele1).perform();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Alert a2 = driver.switchTo().alert();
	a2.dismiss();
	
	WebElement ele2=driver.findElement(By.xpath("//i[@class='fa fa-minus']"));
	Actions a3= new Actions(driver);
	a3.doubleClick(ele2).perform();
	
	driver.close();
	
	
	}

}
