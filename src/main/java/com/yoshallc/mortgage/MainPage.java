package com.yoshallc.mortgage;

import com.yoshallc.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class MainPage extends BasePage {

    public MainPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


   String baseURL = "https://www.bapssatsangexams.org/";


    @FindBy(id = "loginLink")
    public  By signinlink;


    //Go to MainPage
    public MainPage goToMainPage (){
        driver.get(baseURL);
        return this;
    }


    public String validateMainPageTitle(){
        return driver.getTitle();

    }

}
