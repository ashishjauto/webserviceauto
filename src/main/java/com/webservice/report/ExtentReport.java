package com.webservice.report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.util.HashMap;
import java.util.Map;

public class ExtentReport {
    public static ExtentTest test;
    private static Map<String,ExtentReports> reportMap = new HashMap<>();

    private ExtentReport(){}



    public synchronized static final ExtentReports initReporter(String name, String env, String app){
        String key = String.format("%s_%s_%s",name, env, app);

        ExtentReports er = reportMap.get(key);
        if(er == null){
            er = new ExtentReports(System.getProperty("user.dir") + "/test-output/"+key+".html", true);
            er.addSystemInfo("Host Name", "localhost")
                    .addSystemInfo("Environment", env)
                    .addSystemInfo("Application", app);

            reportMap.put(key,er);
        }

        return er;
    }
}
