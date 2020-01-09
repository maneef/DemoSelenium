package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions {

	@Test
	public static void testing() throws Exception {
		
		//set system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Documents\\Chrome\\chromedriver.exe");
		
		// Instantiate the web driver
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		//Implement implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement AboutUs = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/a/span"));
		WebElement OurOffices = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span"));
		WebElement Bang = driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/ul/li[2]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(AboutUs).pause(3000).moveToElement(OurOffices).pause(3000).moveToElement(Bang).pause(3000).click().build().perform();
	}
}
