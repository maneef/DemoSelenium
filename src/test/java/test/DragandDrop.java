package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	
	@Test
	public static void dragdrop() {
	//set system property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Documents\\Chrome\\chromedriver.exe");
			
			// Instantiate the web driver
			WebDriver driver = new ChromeDriver();
			
			//Navigate to the URL
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			
			//Implement implicit wait
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//WebElement from - bank
			WebElement from = driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
			
			//WebElement To
			WebElement to = driver.findElement(By.xpath("//*[@id='bank']"));
			
			//create an object for action class
			Actions action = new Actions(driver);
			action.dragAndDrop(from, to).build().perform();
			WebElement aa = driver.findElement(By.xpath("//*[@id=\'fourth\']/a"));
			WebElement bb = driver.findElement(By.xpath("//*[@id=\'amt7\']"));
			action.dragAndDrop(aa, bb).build().perform();
	}
}
