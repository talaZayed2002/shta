Feature: owner add appartment
 
Scenario: valid apartment inforamtion 
    Given the owner is logged in to the system
    And the owner has a choice list with two choices (add new appartment and dashboard)
    When the owner selects 'add new appartment' 
    And  the owner enter valid information
    And  the system store this appartment

Scenario: invalid photo format
    Given the owner is logged in to the System
	  And add a photo with an invalid format
    Then the system should display an error message
    And the system should read a new link
 
Scenario: owner enters inalid yes/no input 
    Given the owner is logged in to the system
    And enter invalid input instead of yes or no
    Then the system should display an error message 
    And the system should read a new input

Scenario: invalid Onlydigits input  
    Given the owner is logged in to the system
    And enter invalid numeric input
    Then the system should display an error message 
    And the system should read a new input

Scenario: view dashboard
    Given the owner is logged in to the system
    When the owner selects 'Dashboard'
    And  the dashboard will be printed 
  
  
 