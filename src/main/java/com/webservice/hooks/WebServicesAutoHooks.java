package com.webservice.hooks;

import com.webservice.base.WebServiceBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebServicesAutoHooks {

    private WebServiceBase webServiceBase= new WebServiceBase();

    @Before
    public void initialize(){
        System.out.println("++++   Before        ++++");

    }
    @After
    public void neutralize(){
        System.out.println("++++   After        ++++");
        webServiceBase.quitReporter();

    }
}
