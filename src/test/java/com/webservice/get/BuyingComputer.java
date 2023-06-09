package com.webservice.get;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class BuyingComputer {


    @Given("^I want to buy a PC$")
    public void i_want_to_buy_a_pc() throws Throwable {
        System.out.println("I want to buy a PC");
    }

    @When("^I select monitor as 15 inch$")
    public void i_select_monitor_as_15_inch() throws Throwable {
        System.out.println("I select monitor as 15 inch");
    }

    @When("^I select screen as 12 inch$")
    public void i_select_screen_as_12_inch() throws Throwable {
        System.out.println("I select screen as 12 inch");
    }

    @And("^PC should be of Dell$")
    public void pc_should_be_of_dell() throws Throwable {
        System.out.println("PC should be of Dell");
    }

    @And("^it should be a desktop$")
    public void it_should_be_a_desktop() throws Throwable {
        System.out.println("it should be a desktop");
    }

    @And("^a 'carbon' finish$")
    public void a_carbon_finish() throws Throwable {
        System.out.println("a 'carbon' finish");
    }

    @And("^it should be a laptop$")
    public void it_should_be_a_laptop() throws Throwable {
        System.out.println("it should be a laptop");
    }

    @And("^a 'sleak silver' finish$")
    public void a_sleak_silver_finish() throws Throwable {
        System.out.println("a 'sleak silver' finish");
    }

    @And("^I select hard drive 1 TB$")
    public void i_select_hard_drive_1_tb() throws Throwable {
        System.out.println("I select hard drive 1 TB");
    }

}
