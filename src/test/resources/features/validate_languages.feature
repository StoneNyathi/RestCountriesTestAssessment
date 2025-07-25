Feature: Validate South African Sign Language (SASL)

  Scenario: Check if South Africa includes SASL in its languages
    When I send a GET request to the countries endpoint
    Then South Africa should have SASL as an official language	