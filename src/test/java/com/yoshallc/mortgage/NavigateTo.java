package com.yoshallc.mortgage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.yoshallc.mortgage.pageObj.HomePageObj;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;
import java.util.concurrent.TimeUnit;


public class NavigateTo extends HomePageObj {

	private WebDriver driver;
	

	@Test()
	public void testEmailGenerator() throws InterruptedException, IOException {
		
		//mac
		System.setProperty("webdriver.chrome.driver","./chromedriver/mac/chromedriver");

		//windows
		System.setProperty("webdriver.chrome.driver","./chromedriver/windows/chromedriver.exe");

		driver = new ChromeDriver();
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1 = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bapssatsangexams.org/");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		Select dropdown = new Select(txtUserName);
		dropdown.selectByVisibleText("");
		
		TakesScreenshot ts = new TakesScreenshot() {
			
			public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Actions action = new Actions(driver);
		action.moveToElement(txtUserName).build().perform();
	
		Thread.sleep(5000);
		txtUserName.sendKeys("jc_nilesh1980");
		txtPassword.sendKeys("Baps2005");
		btnSignIn.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		assertEquals(true, txtExaminee.isDisplayed());
		driver.quit();
	}
}
