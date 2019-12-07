package com.yoshallc.mortgage.pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObj {
	@FindBy(id ="UserName")
	public WebElement txtUserName;
	
	@FindBy(id ="Password")
	public WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	public WebElement btnSignIn;
	
	@FindBy(xpath="//span[contains(text(),'Examinee ')]")
	public WebElement txtExaminee;

}
