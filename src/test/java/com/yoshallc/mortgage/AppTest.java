package com.yoshallc.mortgage;

import com.yoshallc.core.BaseTest;
import com.yoshallc.core.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;


public class AppTest extends BaseTest {

	private static Logger logger = LoggerFactory.getLogger(AppTest.class);


    @Test
    public void Verify_Its_BAPSSatsangExam_MainPage() throws IOException {


        MainPage mainPage = new MainPage(driver);
        Reporter.log("Loading BAPS Satsang Exam Website");
        mainPage.goToMainPage();
        Reporter.log("Validating title of BAPS Satsang Website to \"Welcome\" ");
        Util.takeScreenshotAtEndOfTest(driver);
        assertEquals(mainPage.validateMainPageTitle(),"Welcome");

    }

    @Test
    public void Verify_Its_Google_MainPage(){

        MainPage mainPage = new MainPage(driver);
        Reporter.log("Loading BAPS Satsang Exam Website");
        mainPage.goToMainPage();
        Reporter.log("Validating title of BAPS Satsang Website to \"Google\" ");
        assertEquals(mainPage.validateMainPageTitle(),"Google");

    }

}
