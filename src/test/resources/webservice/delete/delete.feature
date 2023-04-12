Feature: DELETE User CRUD Property
  Scenario: DELETE User Record
    Given I set DELETE employee service api endpoint
    When I set DELETE HTTP request
    Then I receive valid HTTP response code 200
