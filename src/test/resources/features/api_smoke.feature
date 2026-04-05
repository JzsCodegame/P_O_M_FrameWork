Feature: API smoke checks
  As a QA engineer
  I want to validate basic API behavior through BDD scenarios
  So that we can quickly confirm service health and response contracts

  @api @smoke
  Scenario: Validate all products list API
    Given the API endpoint is "https://automationexercise.com/api/productsList"
    When I send a GET request
    Then the API response status code should be 200
    And the API response JSON should contain all products list
