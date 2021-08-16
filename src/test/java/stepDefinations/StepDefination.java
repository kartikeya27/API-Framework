package stepDefinations;

import static io.restassured.RestAssured.given;
import java.io.IOException;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	
	@Given("user get some test outout")
	public void user_get_some_test_outout() throws IOException {
		res = given().spec(requestSpecification());
	}
	
	@When("user call {string} with {string} http request")
	public void user_call_with_GET_http_request(String resource, String method) {
		// Write code here that turns the phrase above into concrete actions
		// constructor will be called with value of resource which you pass
		APIResources resourceAPI = APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		if (method.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());
		else if (method.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
	}

	@Then("the API call is success with status code {int}")
	public void the_API_call_is_success_with_status_code(Integer int1) {
		assertEquals(response.getStatusCode(), 200);

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
		assertEquals(getJsonpath(response, keyValue), Expectedvalue);
	}
}
