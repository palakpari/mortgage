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
	public void testEmailGenerator() {

		//mac
		//System.setProperty("webdriver.chrome.driver", "//src//test//resources//mac//chromedriver");

		//windows
		System.setProperty("webdriver.chrome.driver","//src//test//resources//windows//chromedriver.exe");


		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bapssatsangexams.org/");

	}
}
