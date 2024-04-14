package Selenium.Elements;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();

		//<input id="ctl00_mainContent_rbtnl_Trip_1" type="radio" name="ctl00$mainContent$rbtnl_Trip" value="RoundTrip" checked="checked">
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_2']")).click();

		//To check how many radio buttons exist in a web page
		System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
		
		//incomplete code to display label
		List<WebElement> all_ele = driver.findElements(By.cssSelector("input[type='radio']"));
		for(WebElement ele: all_ele) {
			System.out.println(ele.getTagName());
		}
		
		
	
		
	}

}
