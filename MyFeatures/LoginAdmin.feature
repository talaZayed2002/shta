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

  @testlogin_admin  
    Scenario Outline: Login admin 
    Given that the admin is not logged in
    And I check for the email  and pass <email><pass>
    Then the admin login is  <status> 

    Examples: 
      | email             | pass        |status |
      | "shafiqa@gmail.com"  | "shafiqa123"    |success|
      | "tala@gmail.com" | "tala1234"   |Fail   |
     
     
      Scenario: Login an admin 
      Given that an admin is not logged in
      And I check for the email  and pass email "tala@gmail.com" pass "1234"
      Then the admin login 

 
      Scenario: user  cannot login
      Given that the user is not logged in
      And I chek for email and   password is "wrong" "wrong"
      Then the user log in fails


      Scenario: owner  cannot login
      Given that the owner is not logged in
      And I chek for email and   password is "wrong" "wrong"
      Then the owner log in fails


      #logout 
      Scenario: Admin log out
	    Given that the admin is logged in
	    When the admin logs out
	    Then the admin is logged out

	    Scenario: user log out 
	    Given that the user is logged in
	    When the user logs out
	    Then the user is logged out


      Scenario: owner log out 
	    Given that the owner is logged in
	    When the owner logs out
	    Then the owner is logged out




















