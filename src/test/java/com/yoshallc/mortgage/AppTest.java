package com.yoshallc.mortgage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AppTest {

	private WebDriver driver;

	@Test()
	public void testEmailGenerator() throws InterruptedException {

		//mac
		System.setProperty("webdriver.chrome.driver","./chromedriver/mac/chromedriver");

		//windows
		//System.setProperty("webdriver.chrome.driver","./chromedriver/windows/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.bapssatsangexams.org/");
		Thread.sleep(5000);
		driver.quit();
	}
}
