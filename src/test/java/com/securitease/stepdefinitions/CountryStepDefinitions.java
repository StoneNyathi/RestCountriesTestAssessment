package com.securitease.stepdefinitions;
import java.io.File;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CountryStepDefinitions {
    private Response response;

    @When("I send a GET request to the countries endpoint")
    public void sendGetRequest() {
        response = RestAssured.get("https://restcountries.com/v3.1/all/ ");
    }

    @Then("the response should conform to the schema")
    public void validateSchema() {
        // Save the schema as `resources/schema.json` (example below)
        response.then().assertThat()
            .body(JsonSchemaValidator.matchesJsonSchema(new File("src/test/resources/schema.json")));
    }

    @Then("the response should return 195 countries")
    public void validateCountryCount() {
        JsonPath jsonPath = response.jsonPath();
        int countryCount = jsonPath.getList("$").size();
        Assert.assertEquals("Total countries should be 195", 195, countryCount);
    }

    @Then("South Africa should have SASL as an official language")
    public void validateSouthAfricanLanguages() {
        JsonPath jsonPath = response.jsonPath();
        String sasl = jsonPath.getString("find { it.name.commonName == 'South Africa' }.languages.sasl");
        Assert.assertNotNull("SASL not found in South Africa's languages", sasl);
    }
}