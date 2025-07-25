Feature: Validate API Response Schema

  Scenario: Check response conforms to expected schema
    When I send a GET request to the countries endpoint
    Then the response should conform to the schema