Feature: System Administrator - Housing Management

  Scenario: Requesting advertisement for housing
    Given admin login to the system
    When  he receive a request for housing advertisement
    Then  he should be able to accept or reject the request

  Scenario: Viewing reservations
    Given admin login to the system
    When he view the reservations in the system
    Then he should be able to see the list of reservations

  Scenario: Adding and advertising housing units
    Given admin login to the system
    When he add a new housing unit to the system
    Then the housing unit should be available for advertisement

  Scenario: Modifying housing data
    Given admin login to the system
    When he choose to modify housing data
    Then he should be able to change housing details

