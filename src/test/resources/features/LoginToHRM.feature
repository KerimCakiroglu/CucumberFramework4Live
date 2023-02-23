Feature: Login Functionality

  @smoke @regression
  Scenario: Valid Login
    #Given I navigated to HRM website
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in

  # And I will quit the browser
  @regression
  Scenario: Invalid Password
    #Given I navigated to HRM website
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate that Invalid Credentials is displayed

  # And I will quit the browser
  
  #Feature: Login with Outline and DataTable
  #@LoginOutline @LoginMultiple
  #Scenario Outline: Login using Scenario Outline and Example Table
    #When user enters login info "<username>" and "<password>"
    #And I click on login button
    #Then Welcome "<firstname>" message is displayed
#
    #Examples: 
      #| username | password    | firstname |
      #| Kerim61  | Cakir6161   | Kerim     |
      #| Kerim66  | Cakir6666   | Kerim     |
      #| Kerim666 | Cakir616161 | Kerim     |
#
  #@LoginMultiple @DataTable
  #Scenario: Login using Datatable
    #When user enters username and password and clicks on login
      #| username | password    | firstname |
      #| Cakir61  | Cakir6161   | Cakir     |
      #| Cakir66  | Cakir6666   | Cakiroglu |
      #| Cakir666 | Cakir616161 | Cakiro    |
