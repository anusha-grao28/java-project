package com.anusha.testing.com.anusha.testing.rest;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredExamples {

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrect() {


            given()
                    .when()
                    .get("https://api.github.com/users/anusha-grao28")
                .then()
                .assertThat()
                .statusCode(is(200))
                .body("login", is("anusha-grao28"));
    }

    @Test
    public void givenUrl_whenSuccessOnGetsResponseAndJsonHasRequiredKV_thenCorrects(){

        given()
                .when()
                .get("https://www.flipkart.com/api/4/discover/autosuggest")
                .then()
                .assertThat().body("requestId",is("df8db6a8-8c85-450a-aa5a-375f49e512bc"));
    }

    @Test
    public void givenUrl_whenSuccessOnGetResponseJsonREquire_thenCorrect(){
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat().body("id",is(100));
    }

    @Test
    public void givenUrl_whenSuccessOnGetReponseJsonEquiredForSinglePost(){
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .assertThat().body("userId",is(1));
    }

    @Test
    public void givenUrl_whenSuccessOnPutREsponseJsonREquired_thenCorrect(){

        given()
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")

                .then()
                .assertThat().body("id",equalTo(1));
    }

    @Test
    public void givenUrl_whenSuccessOnPostREsponseJsonREquire_thenRight(){
        given()
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")

                .then()
                .assertThat().body("id",is(101));
    }

    @Test
    public void givenUrl_whenSuccessOnFetchResponseJsonREquired(){
        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/posts")

                .then()
                .assertThat().body("id",is(101));
    }
}
