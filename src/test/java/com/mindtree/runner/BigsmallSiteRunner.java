package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="Feature",
		glue = "com.mindtree.stepDefinition",
		monochrome = true
)
public class BigsmallSiteRunner extends AbstractTestNGCucumberTests {



}
