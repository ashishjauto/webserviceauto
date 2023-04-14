package com.webservice.auto.get;


import com.relevantcodes.extentreports.LogStatus;
import com.webservice.base.WebServiceBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class UserNotExist extends WebServiceBase {

    private int statusCode ;


    @Given("^I set GET user id service api endpoint$")
    public void i_set_get_user_id_service_api_endpoint()   {
        test = extent.startTest("UserNotExist");
        System.out.println("set GET employee by id service api endpoint");

    }

    @When("^I set request Header with invalid userid$")
    public void i_set_request_header_with_invalid_userid() throws URISyntaxException {

        Map<String,String> customHeader= new HashMap<>();

        customHeader.put("application","application/json");

        String body = RestAssured.
                given().
                 headers(customHeader).
                when().
                get(new URI("/23"))
                .thenReturn()
                .body().asString();

        test.log(LogStatus.INFO, body);
    }

    @Then("Server should  validate  HTTP response code {int}")
    public void server_should_validate_http_response_code_403(int validateStatusCode) throws Throwable {
        statusCode = RestAssured
                .given()
                .accept(ContentType.JSON)
                .when()
                .get(new URI("/55"))
                .thenReturn().statusCode();


        Assert.assertEquals(HttpStatus.SC_FORBIDDEN,validateStatusCode);

        test.log(LogStatus.INFO, String.valueOf(statusCode));

        quitReporter();
    }
}