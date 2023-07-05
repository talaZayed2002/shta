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
Feature: Housing view
@enter
Scenario: Tenant views available housing
Given the tenant is logged in
When the tenant accesses the housing view
Then the tenant can see the list of available housing options

Scenario: Tenant views detailed information about a housing listing
Given the tenant is logged in
When the tenant selects a specific housing listing
Then the tenant can view pictures of the housing and access information such as prices, location, and available services
