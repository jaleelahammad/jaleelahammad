package Selenium.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//From")).click();

		
	}

}
