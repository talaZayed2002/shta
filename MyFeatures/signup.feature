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
Feature: User Sign Up

Scenario: User successfully signs up

Given the user is on the sign-up page
When the user enters valid registration details 
And submits the form
Then the user sign up successfully 

#Scenario: User enters invalid email address

#Given the user is on the sign-up page
#When the user enters an invalid email address
#And submits the form
#Then an error message should be displayed indicating the invalid email address
#And the user should not receive an email for verification
#And the user account should not be created*/



