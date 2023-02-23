@Outline
Feature: Scenario Outline Example

  Scenario Outline: 
    When Login with "<username>" and "<password>"
    And Click on the Login button
    Then Validate that "<username>" is displayed
    And We want to say Bye "<fullname>"

    Examples: 
      | username | password | fullname    |
      | Emine    | e1234    | EmineKara   |
      | Volkan   | v1234    | VolkanGedik |
      | Harun    | h1234    | HarunBicak  |
