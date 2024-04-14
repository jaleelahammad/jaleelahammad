package Selenium.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Elements preceeding and following siblings
		
		//System.setProperty is optional. If provided, a key-value pair to be provided. Key can be any string and value should be valid patf of driver
		//WebDriver takes care of chromedriver identification if SetProperty is not provided
	
		System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		
		/*
		<div style="text-align: right;margin-top: -30px;">
          <a href="https://www.rahulshettyacademy.com/"><button class="btn btn-primary">Home</button></a>
          <button class="btn btn-primary">Practice</button>	
          <button class="btn btn-primary">Login</button>
          <button class="btn btn-primary">Signup</button>
      </div>		 */

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText()); //Gives Practice
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //Gives Login
//Same 		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button")).getText()); //Gives Login

		System.out.println(driver.findElement(By.xpath("//header/div/button[3]/preceding-sibling::button[1]")).getText()); //Gives Login

		
		
	}

}
