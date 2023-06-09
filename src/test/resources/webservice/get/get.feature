Feature: GET User CRUD Property
  Scenario: GET User Record
    Given I set GET employee service api endpoint
    When I set request Header
    Then I receive valid HTTP response code 200



  Scenario: GET User By ID
    Given I set GET employee by id service api endpoint
    When I set request Header with userid
    Then Request  receive valid HTTP response code 200



  Scenario: GET User does not exist
    Given I set GET user id service api endpoint
    When I set request Header with invalid userid
    Then Server should  validate  HTTP response code 403