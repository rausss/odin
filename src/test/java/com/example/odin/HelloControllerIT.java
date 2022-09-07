package com.example.odin;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.spel.ast.Operator;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class HelloControllerIT {

  /* @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
    } */

    @Test
    public void validatesHello() {
        when().request("GET", "/").then().statusCode(200);
    }


    @Test
    public void validatesAdd() {
        when().request("GET", "/add?i=1&j=2").then().assertThat().body(equalTo("3"));

    }

    @Test
    public void validatesSubtract() {
        when().request("GET", "/subtract?i=2&j=1").then().assertThat().body(equalTo("1"));




    }

}
