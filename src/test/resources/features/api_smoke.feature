Feature: API smoke checks
  As a QA engineer
  I want to validate basic API behavior through BDD scenarios
  So that we can quickly confirm service health and response contracts

  @api @smoke
  Scenario Outline: Validate products API behavior for multiple methods
    Given the API endpoint is "<endpoint>"
    When I send a "<method>" request
    Then the API response status code should be <statusCode>
    And the API response should contain "<expectedMessage>"

    Examples:
      | endpoint                                        | method | statusCode | expectedMessage                         |
      | https://automationexercise.com/api/productsList | GET    | 200        | products                                |
      | https://automationexercise.com/api/productsList | POST   | 405        | This request method is not supported.   |
