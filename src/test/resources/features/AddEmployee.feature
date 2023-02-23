#Homework 1: Implement Add Employee Feature and steps for each scenario:
@addEmployee
Feature: Add Employee

  @regression
  Scenario: Add Employee with first and last name
    Given user is logged in with valid credentials
    And user navigates to Add Employee page
    When user enters firstname lastname location
    And clicks on save button(Add Employee Page)
    Then take screenshot

@regression
  Scenario: Add Employee without employee id (delete employee id before saving)
    Given user is logged in with valid credentials
    And user navigates to Add Employee page
    When user enters firstname lastname location
    When delete employee id
    And clicks on save button(Add Employee Page)
    Then take screenshot

@regression @smoke
  Scenario: Add Employee and create login Credentials
    Given user is logged in with valid credentials
    And user navigates to Add Employee page
    When user enters firstname lastname location
    When clicks create login Details
    And user enters username password and confirmPassword
    And clicks on save button(Add Employee Page)
    Then take screenshot
