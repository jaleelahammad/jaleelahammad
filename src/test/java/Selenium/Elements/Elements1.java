package Selenium.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Elements1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/puppy/documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//Thread.sleep(1000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.className("signInBtn")).click();
		//<p class="error">* Incorrect username or password </p>
		System.out.println(	driver.findElement(By.cssSelector("p.error")).getText());
		//<a href="#">Forgot your password?</a>
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		/* HTML for Forgot Password
		<form action="#"><h2>Forgot password</h2>
		<input type="text" placeholder="Name">
		<input type="text" placeholder="Email">
		<input type="text" placeholder="Phone Number">
		<br>
		<div class="forgot-pwd-btn-conainer">
		<button class="go-to-login-btn">Go to Login</button>
		<button class="reset-pwd-btn">Reset Login</button></div></form>
		*/
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jaleel");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Jaleel@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Jaleel@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456"); //Indexing from parent to child
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String pw_txt=	driver.findElement(By.cssSelector(".infoMsg")).getText();
		System.out.println(pw_txt);
		String pw=getPassword(pw_txt);
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");		
		//driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(pw);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(pw); //Regular Expression in CSS
		//<input type="checkbox" id="chkboxOne" name="chkboxOne" value="rmbrUsername">
		//driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		//driver.findElement(By.cssSelector(".chkboxOne")).click(); // Not working, to be investigated
		//driver.findElement(By.cssSelector("input[id='chkboxOne'])")).click(); // Not working, to be investigated
		
		//<button class="submit signInBtn" type="submit">Sign In</button>
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();  //Regular Expression in Xpath
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		//Xpath based on the text
		//<button class="logout-btn">Log Out</button>
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	//	driver.findElement(By.xpath("//*[text()='Log Out']")).click(); //* can be given in Xpath for any tag name as long unique
		
		driver.close();
	}
	
	
	public static String getPassword(String pw_txt2) {
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] pw_arr1=pw_txt2.split("'");
		String[] pw_arr2=pw_arr1[1].split("'");
		System.out.println(pw_arr2[0]);
		return pw_arr2[0];
		
	}

}



