package test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tuesday {

	@Test
	public static void testing() throws Exception {
		
		//set system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Documents\\Chrome\\chromedriver.exe");
		
		// Instantiate the web driver
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		//Implement implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// Create an object for webdriver wait
		WebDriverWait waitt = new WebDriverWait(driver,50);
		
		
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("userName"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement lgn = driver.findElement(By.name("Login"));
		uname.sendKeys("Admin");
		pwd.sendKeys("Password456");
		lgn.click();
		Assert.assertTrue(driver.getTitle().equals("Admin Home"));
		//Assert 
//		Assert.assertTrue(driver.findElement(By.xpath(".//*[@test='true']")).getText().contains("Hi, Admin"));
//		driver.findElement(By.xpath(".//button[@class='btn btn-nav active']")).click();
//		driver.findElement(By.id("catgName")).sendKeys("Holidays");
//		driver.findElement(By.id("catgDesc")).sendKeys("Bags");
//		driver.findElement(By.xpath(".//input[@value='Add']")).click();
		driver.findElement(By.xpath(".//button[contains(@onclick,'viewProd')]")).click();
//		driver.findElement(By.xpath(".//button[@class='btn btn-nav'] and h4[@text() = 'View Product']")).click();
		
		Select cat_name = new Select(driver.findElement(By.id("categorydropid")));
		cat_name.selectByVisibleText("Electronics");
		Select subcat_name = new Select(driver.findElement(By.id("subcategorydropid")));
		subcat_name.selectByVisibleText("Travel Kit");
//		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@value = 'View Products']")).click();
		
		waitt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//table[@class = 'table table-hover']"))));
		
		//clicking the delete button
		driver.findElement(By.xpath(".//input[@value = 'Delete']")).click();
		waitt.until(ExpectedConditions.alertIsPresent());
		
		//Handling Alerts
		Alert alert = driver.switchTo().alert();
		if(alert.getText().contains("Are you sure, you want to delete?")) {
			alert.dismiss();
			
			Alert alert1 = driver.switchTo().alert();
			Thread.sleep(5000);
			if(alert.getText().contains("Cancelling deletion!")) {
				alert1.accept();
			}
		}
		//Handling the list of web elements
		List<WebElement> aa = driver.findElements(By.xpath("(.//table)[2]//tbody//tr//td[1]"));
			for(WebElement webElement : aa) {
				if(webElement.getText().contains("Gift set")) {
					driver.findElement(By.xpath(".//button[@id='modify']")).click();
					System.out.println("maneef");
				}
			}
	}
}
