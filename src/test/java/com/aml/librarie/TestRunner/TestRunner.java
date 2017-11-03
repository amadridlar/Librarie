package com.aml.librarie.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"com.aml.librarie.TestRunner.StepDefinitions"}
		)

public class TestRunner {


}
