package com.yoshallc.mortgage;

import com.yoshallc.core.BaseTest;
import com.yoshallc.core.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class AppTest extends BaseTest {

	private static Logger logger = LoggerFactory.getLogger(AppTest.class);


    @Test
    public void Verify_Its_BAPSSatsangExam_MainPage() throws IOException {


        MainPage mainPage = new MainPage(driver);
        Reporter.log("Loading BAPS Satsang Exam Website");
        mainPage.goToMainPage();
        Reporter.log("Validating title of BAPS Satsang Website to \"Welcome\" ");
        Util.takeScreenshotAtEndOfTest(driver,"Verify_Its_BAPSSatsangExam_MainPage");
        assertEquals(mainPage.validateMainPageTitle(),"Welcome");

    }

    // click login link


    @Test(dependsOnMethods = "Verify_Its_BAPSSatsangExam_MainPage")
    public void click_loginLink() throws IOException {


        MainPage mainPage = new MainPage(driver);
        Reporter.log("Clicking Login Link");
        Util.takeScreenshotAtEndOfTest(driver,"click_loginLink");
        mainPage.clickSignIn();
    }

    @Test(dependsOnMethods = "click_loginLink")
    public void enterCreds()throws IOException{

        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("<replace with username>","<replace with password>", "enterCreds");
    }

    @Test(dependsOnMethods = "enterCreds")
    public void validateSuccessfulLogin() throws IOException{

        HomePage homePage = new HomePage(driver);
        Util.takeScreenshotAtEndOfTest(driver,"validateSuccessfulLogin");
        assertEquals(homePage.readCandidateName(),"Nilesh Patel");


    }

    @Test(dependsOnMethods = "validateSuccessfulLogin")
    public void doLogout() throws IOException{

        HomePage homePage = new HomePage(driver);
        MainPage mainPage = new MainPage(driver);
        homePage.doLogout();
        Util.takeScreenshotAtEndOfTest(driver,"doLogout");
        assertEquals(true,mainPage.isSigninlink());

    }

}
