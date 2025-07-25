Feature: Confirm Total Number of Countries

  Scenario: Validate there are 195 countries
    When I send a GET request to the countries endpoint
    Then the response should return 195 countries