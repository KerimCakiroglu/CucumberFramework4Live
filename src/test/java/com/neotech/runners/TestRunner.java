package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		// we can specify which feature/features to run
		features = "src/test/resources/features/",

		// we can specify where the code for the above feature file is located
		glue = "com.neotech.steps",

		// if true, it does not run the java classes. Only checks the feature files
		// if they are glued to some java code
		dryRun = false,

		// tags can do the same things groups on testng do
		tags = "@HW4",

		monochrome = true)

public class TestRunner {

}