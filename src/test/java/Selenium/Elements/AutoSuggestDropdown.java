package Selenium.Elements;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Dropdown static with Select Class
		
		//This is optional. If provided, a key-value pair to be provided. Key can be any string and value should be valid patf of driver
		//WebDriver takes care of chromedriver identification if SetProperty is not provided
	
		System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();

		//Identify drop down, pass the partial search key, read all values into Web Elements, search for specific keyword in list, click
		
		driver.findElement(By.id("autosuggest")).sendKeys("states");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement ele: options) {
			if(ele.getText().equalsIgnoreCase("United States (USA)")){
				ele.click();
				break;
			}
				
		}
	
		
	}

}
