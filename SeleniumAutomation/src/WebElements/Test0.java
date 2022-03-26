package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bing.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement ele2 = driver.findElement(By.id("sb_form_q"));
	ele2.sendKeys("seleni");
	
	Thread.sleep(3000);
	
	List<WebElement> ele3=driver.findElements(By.xpath("//li[@class='sa_sg']"));
	System.out.println(ele3.size());
	
	for(WebElement b:ele3) 
	{
		System.out.println(b.getText());
	
	}
	driver.close();
	}

}
