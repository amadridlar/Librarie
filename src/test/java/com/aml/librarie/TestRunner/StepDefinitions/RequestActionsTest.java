package com.aml.librarie.TestRunner.StepDefinitions;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.aml.librarie.Book;
import com.aml.librarie.request.RequestJson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RequestActionsTest {
	
	Book book;
	RequestJson requestJSON;
	JSONObject json;
	//JsonParser jsonparser;
	Response response;
	String locationHeader;
	int statusCode;
	
	@Given("^a book created without parameters$")
	public void a_book_created_without_parameters() throws Throwable {
		book = new Book(); 
	}

	@When("^I want to create a JSON of that book$")
	public void i_want_to_create_a_JSON_of_that_book() throws Throwable {
		json = new JSONObject();
		requestJSON = new RequestJson();
		json = requestJSON.createBookJson(book);
		
	}

	@Then("^the JSON is created correctly with ref = (-\\d+), authorName = \"([^\"]*)\" and bookName = \"([^\"]*)\"$")
	public void the_JSON_is_created_correctly_with_ref_authorName_and_bookName(int arg1, String arg2, String arg3) throws Throwable {
		Assert.assertEquals(arg1, json.get("ref"));
		Assert.assertEquals(arg2, json.get("authorName"));
		Assert.assertEquals(arg3, json.get("bookName"));
	}
	
	@Given("^a book created with (\\d+), \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_book_created_with_and(int arg1, String arg2, String arg3) throws Throwable {
		book = new Book(arg1, arg2, arg3);
		
	}

	@When("^I create a JSON of that book$")
	public void i_create_a_JSON_of_that_book() throws Throwable {
		requestJSON = new RequestJson();
		json = new JSONObject();
		json = requestJSON.createBookJson(book);
	}

	@Then("^The JSON created has (\\d+), \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_JSON_created_has_and(int arg1, String arg2, String arg3) throws Throwable {
		Assert.assertEquals(arg1, json.get("ref"));
		Assert.assertEquals(arg2, json.get("bookName"));
		Assert.assertEquals(arg3, json.get("authorName"));
	}
	
	@Given("^a book created$")
	public void a_book_created() throws Throwable {
		book = new Book();
	}

	@When("^I make a post to the URL \"([^\"]*)\"$")
	public void i_make_a_post_to_the_URL(String arg1) throws Throwable {
		requestJSON = new RequestJson();
		json = requestJSON.createBookJson(book);
		String jsonString = json.toJSONString();
		RestAssured.baseURI = arg1;
		response = 
				given().
					contentType("application/Json").
					body(jsonString).
				when().
					post("").
				then().
					extract().response();
		locationHeader = response.header("Location");
		System.out.println("url location "+locationHeader);
		statusCode = response.statusCode();
			
	}

	@Then("^the status code of the response is (\\d+)$")
	public void the_status_code_of_the_response_is(int arg1) throws Throwable {
		Assert.assertEquals(arg1, statusCode);
	}
	
	@Given("^a JSON of a book created with ref (\\d+), bookName \"([^\"]*)\" and authorName \"([^\"]*)\"$")
	public void a_JSON_of_a_book_created_with_ref_bookName_and_authorName(int arg1, String arg2, String arg3) throws Throwable {
		book = new Book(arg1, arg2, arg3);
		requestJSON = new RequestJson();
		json = requestJSON.createBookJson(book);
	}

	@When("^I make a post request of that JSON to the url \"([^\"]*)\"$")
	public void i_make_a_post_request_of_that_JSON_to_the_url(String arg1) throws Throwable {
		String jsonString = json.toJSONString();
		System.out.println(jsonString);
		RestAssured.baseURI = arg1;
		response = 
				given().
					contentType("application/Json").
					body(jsonString).
				when().
					post("").
				then().
					extract().response();
		locationHeader = response.header("Location");
	}

	@Then("^I make a get request to the url \"([^\"]*)\" and the JSON has the ref (\\d+), bookName \"([^\"]*)\" and authorName \"([^\"]*)\" correctly$")
	public void i_make_a_get_request_to_the_url_and_the_JSON_has_the_ef_bookName_and_authorName_correctly(String arg1, int arg2, String arg3, String arg4) {
		RestAssured.baseURI = locationHeader;
		response = 
				given().contentType("application/Json").when().get("").then().assertThat().
				body("ref", equalTo(arg2)).
				body("bookName", equalTo(arg3)).
				body("authorName", equalTo(arg4)).
				extract().response();
			
	}

	@Then("^status code is (\\d+)$")
	public void status_code_is(int arg1) throws Throwable {
		Assert.assertEquals(arg1, response.statusCode());  
	}
}
