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
Feature: Admin login
 Description: The Administrator logs into the library system and also logs out
 Actor:Administrator

  @tag1
  Scenario: Administrator can login to the sysetm
   Given that the administrator is not logged in to the system  
   And the password is equal to "12345"
   Then the administrator should login to teh system
   And the adminstrator is logged in to the system



