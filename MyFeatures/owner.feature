Feature: add the information for new owner  
Scenario: valid information
    Given the owner signed up 
    And enter your infornation statement is printed
    Then the owner enter valid information
    And the system store this owner	
 #phone and id 
Scenario: invalid phone or id 
    Given the owner signed up with new email and password
	  And add the owner enter invalid phone number or id
    Then the system should display an error message
    And the system should read a new phone number or id