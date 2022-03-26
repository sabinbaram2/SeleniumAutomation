package NavigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.get("https://www.skillrary.com/");
	
	Thread.sleep(3000);
	driver.manage().window().minimize();
	
	driver.manage().window().fullscreen();
	
	
	

	}

}
