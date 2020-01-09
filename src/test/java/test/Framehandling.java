package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Framehandling {
	@Test
	public static void frames() {
	//set system property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Documents\\Chrome\\chromedriver.exe");
			
			// Instantiate the web driver
			WebDriver driver = new ChromeDriver();
			
			//Navigate to the URL
			driver.get("                                                                                                            ");
			
			//Implement implicit wait
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//WebElement from - bank
			WebElement from = driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
			
			//WebElement To
			WebElement to = driver.findElement(By.xpath("//*[@id='bank']"));
			
			//create an object for action class
			Actions action = new Actions(driver);

	}
}
