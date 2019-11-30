package com.yoshallc.mortgage;

import com.yoshallc.core.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;


public class AppTest extends BaseTest {

	private static Logger logger = LoggerFactory.getLogger(AppTest.class);


    @Test
    public void testItsMainPage(){

        MainPage mainPage = new MainPage(driver);
        mainPage.goToMainPage();
        assertEquals(mainPage.validateMainPageTitle(),"Welcome");

    }


}
