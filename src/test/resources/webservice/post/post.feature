Feature: Post User CRUD Property
  Scenario: POST User Record
    Given with Content Type as JSON
    When I perform POST HTTP request
    Then the response code returns  HTTP response code 200
