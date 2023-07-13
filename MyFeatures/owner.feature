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
Feature: owner add photos 
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
Scenario: Viewing Housing Details
    Given the owner is logged in to the system
	And the owner has a choice list
    When the owner selects the choice to 'dashboard' 
    And the owner selects a housing from the dashboard
    Then the number of tenants associated with the housing is displayed
    And the number of floors in the selected residence is displayed
Scenario: Viewing Floor Details
    Given the owner has selected a housing and viewed the housing details
    When the owner enter a number of specific floor 
    Then the apartments of the selected floor are displayed
Scenario: Viewing Apartment Details
    Given the user has selected a specific floor and viewed the floor details
    When the user selects a specific apartment 
    Then the names of the tenants associated with the apartment are displayed
    And the contact information of the tenants is displayed
    And the number of bathrooms in the apartment is displayed
    And the number of bedrooms in the apartment is displayed
    And the presence of a balcony in the apartment is displayed








