Feature: owner add appartment
Scenario: valid information
    Given the owner is logged in to the system
    And the owner has a choice list with two choices (add new appartment and dashboard)
    When the owner selects 'add new appartment' 
    And  the owner enter valid information
    And  the system store this appartment

 #photo
Scenario: invalid photo format
    Given the owner is logged in to the System
	  And add a photo with an invalid format
    Then the system should display an error message
    And the system should read a new link
 
 #balcony - water - internet - electricty   
Scenario: owner enters inalid yes/no input 
    Given the owner is logged in to the system
    And enter invalid input instead of yes or no
    Then the system should display an error message 
    And the system should read a new input
 #rent - bathrooms - bedrooms - floor - appartments in floor    
Scenario: invalid Onlydigits input  
    Given the owner is logged in to the system
    And enter invalid input
    Then the system should display an error message 
    And the system should read a new input
 #date 
Scenario: invalid input for date
    Given the owner is logged in to the system
    And enter invalid input
    Then the system should display an error message 
    And the system should read a new input
  