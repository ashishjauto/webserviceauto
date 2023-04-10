package com.webservice.get;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BuyingComputer {


    @Given("I want to buy a PC")
    public void i_want_to_buy_a_pc() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I want to buy a PC");
    }
    @Given("PC should be of Dell")
    public void pc_should_be_of_dell() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("PC should be of Dell ");
    }
    @Given("it should be a desktop")
    public void it_should_be_a_desktop() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("it should be a desktop ");
    }
    @When("I select monitor as {int} inch")
    public void i_select_monitor_as_inch(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I select monitor as {int} inch ");
    }
    @When("a {string} finish")
    public void a_finish(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" a {string} finish");
    }

}
