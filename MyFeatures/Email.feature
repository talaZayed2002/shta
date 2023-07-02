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
Feature: Send an email to the user
	Description: Sending an email to the user that his order is ready and under delivery.
 Actor: company

   
	
Scenario: Send an email to the user.
	Given that order No. "3" of user No. "3" is ready
	When order No. "3" is ready and under delivery, an email is sent to the user with hi email address "tahasoftware080@gmail.com" 
	Then The email was sent successfully
