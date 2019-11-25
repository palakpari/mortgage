package com.yoshallc.mortgage;

import groovy.util.logging.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class AppTest {

	private static Logger logger = LoggerFactory.getLogger(AppTest.class);

	@Test()
	public void testGoogle_gives200OK() throws InterruptedException {

		given().when().get("https://reqres.in/api/users/2").then().statusCode(200);

	}

	@Test
	public void testOneUser_givesOneUser(){

		given().when().get("https://reqres.in/api/users/2").then().body(containsString("Janet"));


	}

	@Test
	public void testUserNotFound(){

		given().when().get("https://reqres.in/api/users/23").then().statusCode(404);

	}

	@Test
	public void testOneUser_givenUserIsJanet(){

		logger.info(given().when().get("https://reqres.in/api/users/2").body().asString());

		given().when().get("https://reqres.in/api/users/2").then().
				body("data.first_name", equalTo("Janet"));

	}

}
