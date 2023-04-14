package com.webservice.hooks;

import com.webservice.base.WebServiceBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class WebServicesAutoHooks {

    private WebServiceBase webServiceBase= new WebServiceBase();

    @Before
    public void initialize(Scenario testScenario){
        System.out.println("++++   Before        ++++");
        System.out.println(testScenario.getName());
        System.out.println(testScenario.getStatus());

    }
    @After
    public void neutralize(Scenario testScenario){
        System.out.println("++++   After        ++++");
        System.out.println(testScenario.getName());
        System.out.println(testScenario.getStatus());
        webServiceBase.quitReporter();

    }
}
