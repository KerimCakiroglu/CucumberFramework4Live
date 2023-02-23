
@background
Feature: Background Example


Background:
Given Precondition1
And Precondition2

@smoke @sprint5
Scenario: Example1
When Test nr1 firstName is "Vugar" and lastName is "Alisultanov"
And Test nr2
And Test n3 age is "30"
Then Validation nr1
And Validation nr2

Scenario: Example2
When Test nr4
And Test nr5
And Test nr6
Then Validation nr3
And Validation nr4

#----------------------

#Hooks are executed for every feature file
#Background is executed only for its featura file
#
#--------
#Hoooks----->@Before
#Background Steps
#Scenario Example1
#Hooks ---> @After
#--------
#
#Hoooks----->@Before
#Background Steps
#Scenario Example2
#Hooks ---> @After


