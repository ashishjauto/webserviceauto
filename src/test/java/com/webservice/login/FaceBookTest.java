package com.webservice.login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class FaceBookTest {

    @Given("^user is at the login page fo the application$")
    public void user_is_at_the_login_page_fo_the_application() throws Throwable {
        System.out.println("user is at the login page fo the application");
    }

    @When("^User login with the following username and password$")
    public void user_login_with_the_following_username_and_password(DataTable userCredential) throws Throwable {
         List<List<String>> data= userCredential.asLists();
         for(List<String> str: data) {

             for(int i =0 ; i <str.size();i++){
                 System.out.println(str.get(i));
             }
         }

    }

    @Then("^User should be able to login with correct username and password$")
    public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
        System.out.println("User should be able to login with correct username and password");
    }

}
