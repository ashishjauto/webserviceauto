Feature: DELETE User CRUD Property
  Scenario: DELETE User Record
    Given I set DELETE employee service api endpoint
    When I set DELETE HTTP request
    Then deletion operation returns  HTTP response code 200
