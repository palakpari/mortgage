package com.yoshallc.mortgage;

import com.yoshallc.core.BaseTest;
import com.yoshallc.w3school.W3SchoolTable;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TableTest extends BaseTest {


    private static Logger logger = LoggerFactory.getLogger(AppTest.class);


    @Test
    public void Verify_Customer_Is_Present() throws IOException {

        W3SchoolTable w3SchoolTable = new W3SchoolTable(driver);
        List<WebElement> companies = w3SchoolTable.customerTable;



        //Loop list using foreach

   /*     companies.forEach((webele) -> {


            //System.out.println(webele.getText());

            if(webele.getText().equalsIgnoreCase("AAA")) {

                webele.click();
            }


            }
        );*/

            companies.stream().filter(webElement -> webElement.getText().equalsIgnoreCase("AAA"))
                    .findFirst().get().click();


        // compare list item


        // what to do if compare matches


    }

}
