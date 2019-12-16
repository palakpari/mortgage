package com.yoshallc.w3school;

import com.yoshallc.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class W3SchoolTable extends BasePage {

    public W3SchoolTable(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    String baseURL = "https://www.w3schools.com/html/html_tables.asp";


    @FindBy(xpath = "//*[@id=\"customers\"]/tbody/tr[1]/th[1]")
    public List<WebElement> customerTable;




   public List<WebElement> listofCustomer(){

        return customerTable;

   }

}
