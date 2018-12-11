package com.cg.registration.stepfiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},features="classpath:registrationfeaturefiles")
public class TestRunner {
	
}
