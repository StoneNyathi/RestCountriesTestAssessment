# Rest Countries API Test Assessment

## Overview
This project demonstrates backend automation tests for the `https://restcountries.com/v3.1/all/ ` API using **BDD (Gherkin)**, **Rest Assured**, and **Java**.

## Features
1. **Schema Validation**: Ensures the API response matches a predefined JSON schema.
2. **Country Count**: Verifies the API returns 195 countries.
3. **Language Validation**: Checks if South Africa lists SASL as an official language.

## Requirements
- Java 11+
- Maven
- IDE (IntelliJ/Eclipse/Visual Studio Code)

## How to Run
1. Clone the repository.
2. Run `mvn test` or execute `TestRunner.java`.
3. View the HTML report at `src/test/resources/reports/test-output.html`.

## Test Results
- ✅ All tests pass if the API returns valid data.
- ❌ Tests fail if:
  - Schema mismatch
  - Country count ≠ 195
  - SASL not found in South Africa's languages
  
Sample Test Report
<!-- Generated in src/test/resources/reports/test-output.html -->
<h2>Test Results</h2>
<ul>
  <li>Schema Validation: ✅ Passed</li>
  <li>Country Count: ✅ Passed (195 countries)</li>
  <li>South Africa Languages: ✅ Passed (SASL found)</li>
</ul>  
