package api.steps;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiStepDefinitions {

    private String endpoint;
    private int statusCode;
    private String responseBody;

    @Given("^the API endpoint is \"([^\"]*)\"$")
    public void the_api_endpoint_is(String endpoint) {
        this.endpoint = endpoint;
    }

    @When("^I send a GET request$")
    public void i_send_a_get_request() throws Exception {
        sendRequest("GET");
    }

    @When("^I send a \"([^\"]*)\" request$")
    public void i_send_a_request(String requestMethod) throws Exception {
        sendRequest(requestMethod);
    }

    private void sendRequest(String requestMethod) throws Exception {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(endpoint);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod.toUpperCase());
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(15000);

            statusCode = connection.getResponseCode();

            InputStream stream;
            if (statusCode >= 200 && statusCode < 400) {
                stream = connection.getInputStream();
            } else {
                stream = connection.getErrorStream();
            }

            if (stream == null) {
                responseBody = "";
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder bodyBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                bodyBuilder.append(line);
            }
            reader.close();
            responseBody = bodyBuilder.toString();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    @Then("^the API response status code should be (\\d+)$")
    public void the_api_response_status_code_should_be(int expectedStatusCode) {
        Assert.assertEquals(statusCode, expectedStatusCode, "Unexpected API status code");
    }
    
    @Then("the API response should contain {string}")
    public void the_api_response_should_contain(String expectedMessage) {
        Assert.assertTrue(
        		responseBody.contains(expectedMessage),
                "Expected response body to contain: " + expectedMessage +
                "\nActual response was: " + responseBody
        );
    }
    
//    @And("^the API response should contain \"([^\"]*)\"$")
//    public void the_api_response_should_contain(String expectedText) {
//        Assert.assertTrue(responseBody.contains(expectedText),
//                "Expected response body to contain: " + expectedText + ". Actual body: " + responseBody);
//    }

    @And("^the API response JSON should contain all products list$")
    public void the_api_response_json_should_contain_all_products_list() {
        Assert.assertTrue(responseBody != null && responseBody.length() > 0, "Response body is empty");
        Assert.assertTrue(responseBody.contains("products"),
                "Expected response body to contain products list JSON. Actual body: " + responseBody);
    }
}
