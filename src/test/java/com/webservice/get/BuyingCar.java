package com.webservice.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingCar {

    @Given("I go to buy car")
    public void i_go_to_buy_car() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("I go to buy car");
    }
    @Given("car must be of the Ford Motors")
    public void car_must_be_of_the_ford_motors() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("car must be of the Ford Motors");
    }
    @Given("car must be white in color")
    public void car_must_be_white_in_color() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("car must be white in color");
    }
    @When("I search for car")
    public void i_search_for_car() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I search for car");
    }
    @When("I select city as Tokyo")
    public void i_select_city_as_tokyo() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I select city as Tokyo");
    }
    @Then("I should get white cars in result")
    public void i_should_get_white_cars_in_result() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should get white cars in result");
    }
    @Then("cars must be atleast {int} years old")
    public void cars_must_be_atleast_years_old(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("cars must be atleast {int} years old");
    }

}
