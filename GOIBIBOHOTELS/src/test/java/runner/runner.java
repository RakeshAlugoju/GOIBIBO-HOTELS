package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/GOIBIBOOJAYA/src/test/resources",glue={"Stepdefination"})

public  class runner {

}
 