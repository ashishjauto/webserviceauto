package com.webservice.auto.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserGet {
    @Given("I set GET employee service api endpoint")
    public void i_set_get_employee_service_api_endpoint() {
        // Write code here that turns the phrase above into concrete actions
         System.out.println("I set GET employee service api endpoint");
      
    }
    @When("I set request Header")
    public void i_set_request_header() {
        // Write code here that turns the phrase above into concrete actions
         System.out.println("I set request Header");
    }
    @When("Send GET HTTP Request")
    public void send_get_http_request() {
        // Write code here that turns the phrase above into concrete actions
         System.out.println("Send GET HTTP Request");
    }
    @Then("I receive valid HTTP response code {int}")
    public void i_receive_valid_http_response_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
         System.out.println("I receive valid HTTP response code {int}");
    }
}
