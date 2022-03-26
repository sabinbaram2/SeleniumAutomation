package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws IOException {

	Properties p=new Properties();
	FileInputStream fis= new FileInputStream("./data.properties");
	p.load(fis);
	
	WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.name("email")).sendKeys(p.getProperty("Username"));
	driver.findElement(By.id("password")).sendKeys(p.getProperty("Password"));
	
	driver.close();

	}

}
