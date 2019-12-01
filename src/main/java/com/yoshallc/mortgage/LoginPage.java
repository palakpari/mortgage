package com.yoshallc.mortgage;

import com.yoshallc.core.BasePage;
import com.yoshallc.core.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
       PageFactory.initElements(driver, this);
    }


   String baseURL = "https://www.bapssatsangexams.org/Account/SignIn";


    @FindBy(id = "Password")
    public  WebElement passwordtxt;

    @FindBy(id = "UserName")
    public WebElement usernametxt;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/form/div[3]/button")
    public WebElement submitBtn;


    public void doLogin(String username, String passwrod, String testcase) throws IOException {

        sendKeys(usernametxt,username);
        sendKeys(passwordtxt,passwrod);
        Util.takeScreenshotAtEndOfTest(driver,testcase);
        click(submitBtn);
    }


}
