package com.yoshallc.mortgage;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;


public class AppTest {


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
}
