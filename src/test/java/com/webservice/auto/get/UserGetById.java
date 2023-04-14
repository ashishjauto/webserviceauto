package com.webservice.auto.get;

import com.relevantcodes.extentreports.LogStatus;
import com.webservice.base.WebServiceBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.net.URI;
import java.net.URISyntaxException;

public class UserGetById extends WebServiceBase {



    private int statusCode ;

    @Given("^I set GET employee by id service api endpoint$")
    public void i_set_get_employee_by_id_service_api_endpoint() throws Throwable {
        test = extent.startTest("UserGetById");
        System.out.println("set GET employee by id service api endpoint");
    }

    @When("^I set request Header with userid$")
    public void i_set_request_header_with_userid() throws Throwable {

       RestAssured.
                given().
                accept(ContentType.JSON).
                when().
                get(new URI("/1"))
                .then()
                .body("name", Matchers.equalToIgnoringCase("Adam"),"id",Matchers.equalTo(1));





    }



    @Then("Request  receive valid HTTP response code {int}")
    public void request_receive_valid_http_response_code(int validStatusCode) throws URISyntaxException {
        statusCode = RestAssured
                .given()
                .accept(ContentType.JSON)
                .when()
                .get(new URI("/1"))
                .thenReturn().statusCode();


        Assert.assertEquals(HttpStatus.SC_OK,validStatusCode);

        test.log(LogStatus.INFO, String.valueOf(statusCode));

        quitReporter();

    }

}
