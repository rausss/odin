package com.example.odin;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

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

/*
    }

    @Test
    public void validatesAdd() {
        get("/add?i=1&j=2").then()
                .assertThat().body(equalTo(3));

    } */

}
