package com.webservice.auto.delete;

import com.relevantcodes.extentreports.LogStatus;
import com.webservice.base.WebServiceBase;
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

public class UserDelete  extends WebServiceBase {
    Response response;
    private int statusCode ;


    @Given("^I set DELETE employee service api endpoint$")
    public void i_set_delete_employee_service_api_endpoint() throws Throwable {
        test = extent.startTest("UserDelete");
    }

    @When("^I set DELETE HTTP request$")
    public void i_set_delete_http_request() throws Throwable {

    }

    @Then("deletion operation returns  HTTP response code {int}")
    public void deletion_operation_returns_http_response_code_200(int validateStatusCode) throws Throwable {


        statusCode = RestAssured.
                given().
                accept(ContentType.JSON).delete("/users/1").thenReturn().statusCode();
        test.log(LogStatus.INFO, String.valueOf(statusCode));
        quitReporter();

    }
}
