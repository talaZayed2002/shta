

Feature: admin see requests 

  Scenario: requests
    Given the admin is log in to the system 
    When the system view the requests
    Then the admin can accept some requests
    And the admin can reject another requests 
   
