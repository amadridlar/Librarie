package com.aml.librarie.TestRunner.StepDefinitions;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.aml.librarie.Book;
import com.aml.librarie.request.RequestJson;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonParser;


public class RequestActionsTest {
	
	Book book;
	RequestJson requestJSON;
	JSONObject json;
	JsonParser jsonparser;
	
	@Given("^a book created without parameters$")
	public void a_book_created_without_parameters() throws Throwable {
		book = new Book(); 
	}

	@When("^I want to create a JSON of that book$")
	public void i_want_to_create_a_JSON_of_that_book() throws Throwable {
		json = requestJSON.createBookJson(book);
		
	}

	@Then("^the JSON is created correctly with ref = (-\\d+), authorName = NULL and bookName = NULL$")
	public void the_JSON_is_created_correctly_with_ref_authorName_NULL_and_bookName_NULL(int arg1) throws Throwable {
		Assert.assertEquals(arg1, json.getString("ref"));
		
	}

	@Given("^a book created with ref = (\\d+), authorName = \"([^\"]*)\" and bookName = \"([^\"]*)\"$")
	public void a_book_created_with_ref_authorName_and_bookName(int arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I make a post to the URL \"([^\"]*)\"$")
	public void i_make_a_post_to_the_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the json with the book information is storage with ref = (\\d+), authorName = \"([^\"]*)\" and bookName = \"([^\"]*)\"$")
	public void the_json_with_the_book_information_is_storage_with_ref_authorName_and_bookName(int arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
