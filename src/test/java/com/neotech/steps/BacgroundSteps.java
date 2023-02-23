package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BacgroundSteps {

	@Given("Precondition1")
	public void precondition1() {
		System.out.println("precondtion1");
	}

	@Given("Precondition2")
	public void precondition2() {
		System.out.println("precondtion2");
	}

	@When("Test nr1")
	public void test_nr1() {
		System.out.println("test step 1");
	}

	@When("Test nr2")
	public void test_nr2() {
		System.out.println("test step 2");
	}

	@When("Test n3")
	public void test_n3() {
		System.out.println("test step 3");
	}

	@Then("Validation nr1")
	public void validation_nr1() {
		System.out.println("validation step 1");
	}

	@Then("Validation nr2")
	public void validation_nr2() {
		System.out.println("validation step 2");
	}

	@When("Test nr4")
	public void test_nr4() {
		System.out.println("test step 4");
	}

	@When("Test nr5")
	public void test_nr5() {
		System.out.println("test step 5");
	}

	@When("Test nr6")
	public void test_nr6() {
		System.out.println("test step 6");
	}

	@Then("Validation nr3")
	public void validation_nr3() {
		System.out.println("validation step 3");
	}

	@Then("Validation nr4")
	public void validation_nr4() {
		System.out.println("validation step 4");
	}

	@When("Test nr1 firstName is {string} and lastName is {string}")
	public void test_nr1_first_name_is_and_last_name_is(String string, String string2) {

	}

	@When("Test n3 age is {string}")
	public void test_n3_age_is(String string) {

	}

}
