package ku.shop;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
                 plugin = {"pretty", "html:target/cucumber.html"})
public class BuyUAT {
}

