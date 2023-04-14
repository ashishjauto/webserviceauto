package com.webservice.auto.post;

import com.relevantcodes.extentreports.LogStatus;
import com.webservice.base.WebServiceBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;

public class UserPost extends WebServiceBase {


    @Given("^with Content Type as JSON$")
    public void with_content_type_as_json()   {
        test = extent.startTest("UserPost");

        test.log(LogStatus.INFO, "with_content_type_as_json()");

    }

    @When("^I perform POST HTTP request$")
    public void i_perform_post_http_request()   {
        test.log(LogStatus.INFO, "i_perform_post_http_request()");
    }

    @Then("the response code returns  HTTP response code {int}")
    public void the_response_code_returns_http_response_code_200(int statusCode) throws URISyntaxException {
        test.log(LogStatus.INFO, "the_response_code_returns_http_response_code_200()");

        String postBody= "{\"name\":\"Jandoe\",\"birthDate\":\"1993-04-10\"}";

         Response response=


                 given()
                         .header("Content-type", "application/json")
                         .and()
                         .body(postBody)
                         .when()
                         .post(new URI("http://localhost:8080/users"))
                         .then()
                         .extract().response();

        test.log(LogStatus.INFO, String.valueOf(response.statusCode()));








    }





}
