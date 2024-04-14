package Selenium.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Dropdown static with Select Class
		
		//This is optional. If provided, a key-value pair to be provided. Key can be any string and value should be valid patf of driver
		//WebDriver takes care of chromedriver identification if SetProperty is not provided
	
		System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();

		//Dropdown from Select class 
		//Get the element, link to Select object, write Select functions
		WebElement dropdown_ele = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(dropdown_ele);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText()); //To print the selected option
		
		//Radio button
		
	
	
	

		
	}

}
