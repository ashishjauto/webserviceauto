package com.webservice.auto.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.net.URI;
import java.net.URISyntaxException;

public class UserGet {
    Response response;
    private String uri_GET="http://localhost:8080";
    private String user_URI="/users";
    private int statusCode;
    @Given("I set GET employee service api endpoint")
    public void i_set_get_employee_service_api_endpoint() {
        RestAssured.baseURI=uri_GET;

        RestAssured.basePath=user_URI;

         System.out.println("I set GET employee service api endpoint");
      
    }
    @When("I set request Header")
    public void i_set_request_header() throws URISyntaxException {

        /**
         * ContentType.JSON
         * ContentType.HTML
         * ContentType.TEXT
         */


        response = RestAssured.
                    given().
                    accept(ContentType.JSON).
                    when().get(new URI("http://localhost:8080/users"));




    }
    @When("Send GET HTTP Request")
    public void send_get_http_request() throws URISyntaxException {
         statusCode = RestAssured
                   .given()
                   .accept(ContentType.JSON)
                   .when()
                   .get(new URI("http://localhost:8080/users"))
                .thenReturn().statusCode();
        System.out.println("StatusCode "+ statusCode);

    }
    @Then("I receive valid HTTP response code {int}")
    public void i_receive_valid_http_response_code(Integer validDateStatusCode) {
        System.out.println(statusCode +" --> "+ validDateStatusCode );
    }
}
