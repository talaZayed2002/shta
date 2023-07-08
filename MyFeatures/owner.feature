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
Feature: owner adds photos 
Scenario: Owner adds photos to the list 
    Given the owner is logged in to the system
    And the owner has a choice list
    When the owner selects the choice to 'add new appartment' 
    And chooses to add photos
    Then the owner will be able to add multiple photos linkes
    And the system should store the added photos	  	
Scenario: Owner adds invalid photo format
    Given the owner is logged in to the System
    And the owner has a choice list
    When the owner selects the choice to 'add new appartment'
    And chooses to add photos
	And add a photo with an invalid format
    Then the system should display an error message
    And the owner will not be able to add the photo link

Feature: owner adds location 
Scenario: Owner adds residence location details
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add location' 
    Then the owner will be able to add location details
    And the system should store the location details
Scenario: Owner adds invalid location details
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add location'
    And add invalid location details	
    Then the system should display an error message
    And the owner will not be able to add location details

Feature: owner adds sevices 
Scenario: Owner adds sevices
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add sevices' 
    Then the owner will be able to add add sevices sperated with commas 
    And the system should store the location details
Scenario: Owner adds invalid srevices
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add sevices' 
    And add invalid services 		
    Then the system should display an error message
    And the owner will not be able to store the services
	
Feature: add rent
Scenario: Owner adds rent
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add rent' 
    Then the owner will be able to add the rent 
    And the system should store the rent	
Scenario: Owner adds invalid srevices
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add rent' 
    And add invalid rent 		
    Then the system should display an error message
    And the owner will not be able to store the rent

Feature: add rent with water and electricity
Scenario: Owner adds rent with water and electricity
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add rent with water and electricity' 
    Then the owner will be able to add the rent with water and electricity
    And the system should store the rent with water and electricity	
Scenario: Owner adds invalid srevices
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add new appartment' was selected
    And chooses to 'add rent with water and electricity' 
    And add invalid rent with water and electricity		
    Then the system should display an error message
    And the owner will not be able to store the rent with water and electricity
 
Feature: add address of owner 
Scenario: Owner enter the address 
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add your information' was selected
    And chooses to 'address' 
    Then the owner will be able to enter the address
    And the system should store the address		
Scenario: Owner adds invalid address
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add your information' was selected
    And chooses to 'address' 
    And add invalid address	
    Then the system should display an error message
    And the owner will not be able to the address
		
Feature: add id of owner 	
Scenario: Owner enter the id
Scenario: Owner enter the id
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add your information' was selected
    And chooses to 'id' 
    Then the owner will be able to enter the id
    And the system should store the id		
Scenario: Owner adds invalid id
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add your information' was selected
    And chooses to 'id' 
    And add invalid id
    Then the system should display an error message
    And the owner will not be able to the id

Feature: add phone number  of owner 	
Scenario: Owner enter the phone number
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add your information' was selected
    And chooses to 'phone number' 
    Then the owner will be able to enter the phone number
    And the system should store the phone number		
Scenario: Owner adds invalid phone number
    Given the owner is logged in to the system
    And the owner has a choice list
    When the choice 'add your information' was selected
    And chooses to 'phone number' 
    And add invalid phone number
    Then the system should display an error message
    And the owner will not be able to the phone number




