package com.cg.equipmgmtsys.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"com.cg.equipmgmtsys.stepdefinitions"})
public class TestRunner {

}
