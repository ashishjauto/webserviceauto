package com.webservice.auto.get;

import com.relevantcodes.extentreports.LogStatus;
import com.webservice.base.WebServiceBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.net.URI;
import java.net.URISyntaxException;


public class UserGet extends WebServiceBase {
    Response response;
    private final String uri_GET="http://localhost:8080";
    private final String user_URI="/users";
    private int statusCode;
    @Given("I set GET employee service api endpoint")
    public void i_set_get_employee_service_api_endpoint() {
        test = extent.startTest("UserGet");
        RestAssured.baseURI=uri_GET;

        RestAssured.basePath=user_URI;

         System.out.println("I set GET employee service api endpoint");
      
    }
    @When("I set request Header")
    public void i_set_request_header() throws URISyntaxException {

        /*
          ContentType.JSON
          ContentType.HTML
          ContentType.TEXT
         */


        response = RestAssured.
                    given().
                    accept(ContentType.JSON).
                    when().get(new URI("/users"));
        test.log(LogStatus.INFO, "I set request Header");



    }

    @Then("I receive valid HTTP response code {int}")
    public void i_receive_valid_http_response_code(int validDateStatusCode) throws URISyntaxException {
        test.log(LogStatus.INFO, "I receive valid HTTP response code");
        statusCode = RestAssured
                .given()
                .accept(ContentType.JSON)
                .when()
                .get(new URI("/users"))
                .thenReturn().statusCode();


        Assert.assertEquals(HttpStatus.SC_OK,validDateStatusCode);



    }
}
