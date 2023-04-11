package comwebservice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class
)
@CucumberOptions(
        features={"src/test/resources"},
        glue={"com.webservice.get"}
)
public class CarRunner {
}
