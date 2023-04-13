Feature: GET User CRUD Property
  Scenario: GET User Record
    Given I set GET employee service api endpoint
    When I set request Header
    Then I receive valid HTTP response code 200
