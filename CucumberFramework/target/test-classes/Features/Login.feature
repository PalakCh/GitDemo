#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Application Login
  

  @tag1
  Scenario: Home Page Default Login
    Given User is on the Netbanking login page
    When User login the application with "ABC" and password "123"
    Then Home page is populated
    And Cards are displayed
    
      @tag1
  Scenario: Home Page Default Login
    Given User is on the Netbanking login page
    When User login the application with "ABCD" and password "12345"
    Then Home page is populated
    And Cards are displayed

