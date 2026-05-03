Feature: API smoke checks
  As a QA engineer
  I want to validate basic API behavior through BDD scenarios
  So that we can quickly confirm service health and response contracts

  @api @smoke
  Scenario Outline: Validate products API behavior for multiple methods
    Given the API endpoint is "<endpoint>"
    When I send a "<method>" request
    Then the API response status code should be <statusCode>
    And the API response should contain '<expectedMessage>'

    Examples:
      | endpoint                                        | method | statusCode | expectedMessage                         |
      | https://automationexercise.com/api/productsList | GET    | 200        | products                                |
      | https://automationexercise.com/api/productsList | POST   | 200        | This request method is not supported.   |
      | https://automationexercise.com/api/brandsList   | GET    | 200        | {"responseCode": 200, "brands": [{"id": 1, "brand": "Polo"}, {"id": 2, "brand": "H&M"}  						|
      | https://automationexercise.com/api/verifyLogin  | DELETE | 200        | {"responseCode": 405, "message": "This request method is not supported."}  |
      
      
