package NavigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.navigate().to("https://www.amazon.com/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.close();
	
	

	}

}
