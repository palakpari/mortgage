package com.yoshallc.mortgage;

import com.yoshallc.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
       PageFactory.initElements(driver, this);

    }

   String baseURL = "https://www.bapssatsangexams.org/";



    @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/div[2]/div/a/span")
    public WebElement candinateName;

    @FindBy(className = "btn-logoff")
    public WebElement logoff;

    public String readCandidateName(){
        return readText(candinateName);

    }

    public void doLogout(){

        logoff.click();
    }

}
