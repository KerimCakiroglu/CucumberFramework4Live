package com.neotech.steps;

import java.util.List;
import java.util.Map;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

//	LoginPageElements login;
//	DashboardPageElements dashboard;

	@Given("I navigated to the HRM website")
	public void i_navigated_to_the_hrm_website() {
		// This is done in the Hooks
		// setUp();

//		login = new LoginPageElements();
//		dashboard = new DashboardPageElements();
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.logInButton);
	}

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		if (actual.equals(expected)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

	@Then("I will quit the browser")
	public void i_will_quit_the_browser() {
		// This is done in the Hooks
		// tearDown();
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(login.password, "dede");
	}

	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed() {

		String expectedText = "Invalid Credentials";
		String actualText = login.invalidMsg.getText();

		if (actualText.equals(expectedText)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		// This is done in the Hooks
		// setUp();

		login.adminLogin();
	}

	@When("user enters login info {string} and {string}")
	public void user_enters_login_info_and(String username, String password) {
		sendText(login.username, username);
		sendText(login.password, password);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Welcome {string} message is displayed")
	public void welcome_message_is_displayed(String firstname) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password and clicks on login")
	public void user_enters_username_and_password_and_clicks_on_login(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		List<Map<String, String>> listOfMaps = dataTable.asMaps();

		for (Map<String, String> map : listOfMaps) {
			sendText(login.username, map.get("username"));
			sendText(login.password, map.get("password"));
			click(login.logInButton);

			System.out.println(map);
			System.out.println("Firstname :" + map.get("FirstName"));
			System.out.println("Middlename :" + map.get("MiddleName"));
			System.out.println("Lastname :" + map.get("LastName"));
		}
	}
}
