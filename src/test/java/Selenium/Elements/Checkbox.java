package Selenium.Elements;


import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Checkbox {

	public static void main(String[] args) throws InterruptedException {		
		//Checkbox selection
		//Total check box in web page
		//Assertion
	
		//System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();

		//<input id="ctl00_mainContent_chk_friendsandfamily" type="checkbox" name="ctl00$mainContent$chk_friendsandfamily">
		driver.findElement(By.cssSelector("input[id*='Arm']")).click();
		Assert.assertTrue("Arm Checkbox selected", driver.findElement(By.cssSelector("input[id*='Arm']")).isSelected());
	
		//To check how many check boxes exist in a web page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		
		driver.close(); //Added new line by Resource-2 git test
		//Added comment from branch developR1
		//Added devR2 comment
		
	}

}
