package com.webservice.auto.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.net.URI;
import java.net.URISyntaxException;

public class UserGetById {

    Response response;
    private final String uri_GET="http://localhost:8080";
   private int statusCode;


    @Given("^I set GET employee by id service api endpoint$")
    public void i_set_get_employee_by_id_service_api_endpoint() throws Throwable {
        RestAssured.baseURI=uri_GET;
    }

    @When("^I set request Header with userid$")
    public void i_set_request_header_with_userid() throws Throwable {

        response = RestAssured.
                given().
                accept(ContentType.JSON).
                when().get(new URI("http://localhost:8080/users/1"));
    }



    @Then("Request  receive valid HTTP response code {int}")
    public void request_receive_valid_http_response_code(int validStatusCode) throws URISyntaxException {
        statusCode = RestAssured
                .given()
                .accept(ContentType.JSON)
                .when()
                .get(new URI("http://localhost:8080/users/1"))
                .thenReturn().statusCode();


        Assert.assertEquals(HttpStatus.SC_OK,validStatusCode);

    }

}