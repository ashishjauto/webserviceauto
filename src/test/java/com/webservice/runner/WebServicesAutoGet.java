package com.webservice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class
)
@CucumberOptions(
        features={"src/test/resources/webservice/get",
                  "src/test/resources/webservice/delete",
                  "src/test/resources/webservice/post"
            },
        glue={  "com.webservice.auto.get",
                "com.webservice.auto.delete",
                "com.webservice.auto.post",
                "com.webservice.hooks",
                        },
        monochrome = true
)
public class WebServicesAutoGet {
}
