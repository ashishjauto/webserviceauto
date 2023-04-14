package com.webservice.base;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.webservice.report.ExtentReport;

import static io.restassured.RestAssured.*;
public class WebServiceBase {

    public static ExtentReports extent;
    public static ExtentTest test;

    public WebServiceBase(){
        baseURI="http://localhost";
        port=8080;
        if (test == null) {
            extent = ExtentReport.initReporter("TestAutomationReport", "non-prod", "DemoWebService" );

        }


    }

    public void quitReporter() {

        extent.flush();


    }

}
