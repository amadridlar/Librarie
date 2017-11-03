package com.aml.librarie.TestRunner.StepDefinitions;

import org.junit.Assert;

import com.aml.librarie.Book;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BookActionsTest {
	
	private Book book;
	private int ref;
	private String bookName;
	private String authorName;
	private int refObtained;

	@Given("^A book wit a reference number (\\d+), an Author \"([^\"]*)\" and a title \"([^\"]*)\"$")
	public void a_book_wit_a_reference_number_an_Author_and_a_title(int arg1, String arg2, String arg3) throws Throwable {
		
		this.ref = arg1;
		this.bookName = arg2;
		this.authorName = arg3;
	    
	}

	@When("^I create this book item with the reference number (\\d+), the Author \"([^\"]*)\" and the title \"([^\"]*)\"$")
	public void i_create_this_book_item_with_the_reference_number_the_Author_and_the_title(int arg1, String arg2, String arg3) throws Throwable {
		
		book = new Book(this.ref, this.bookName, this.authorName);
	}

	@Then("^The book item is created with the correct fields (\\d+), \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_book_item_is_created_with_the_correct_fields_and(int arg1, String arg2, String arg3) throws Throwable {
		Assert.assertEquals(arg1, book.getRef()); 
		Assert.assertEquals(arg2, book.getBookName());
		Assert.assertEquals(arg3, book.getAuthorName());
	}
/***
 * 
 *Scenario Outline: Get the ref number of a book item
 */
	
	
	@Given("^a book item with a reference number (\\d+)$")
	public void a_book_item_with_a_reference_number(int arg1) throws Throwable {
		
		book = new Book(arg1, bookName, authorName);
	}

	@When("^I want to obtain its reference number (\\d+)$")
	public void i_want_to_obtain_its_reference_number(int arg1) throws Throwable {
		
		 this.refObtained = book.getRef();
	}

	@Then("^I get the reference number (\\d+) correctly$")
	public void i_get_the_reference_number_correctly(int arg1) throws Throwable {
		
		Assert.assertEquals(arg1, this.refObtained);
		
	}
	
	/**
	 * Scenario: Create a book without reference, author name or book name
	 */
	@When("^I create a book without parameteres$")
	public void i_create_a_book_without_parameteres() throws Throwable {
		book = new Book();
	}

	@Then("^book is created$")
	public void book_is_created() throws Throwable {
		Assert.assertNotNull(book);;
	}

	@Then("^ref is (-\\d+), author name is NULL and book name is NULL$")
	public void ref_is_author_name_is_NULL_and_book_name_is_NULL(int arg1) throws Throwable {
		Assert.assertEquals(arg1, book.getRef());
		Assert.assertNull(book.getAuthorName());
		Assert.assertNull(book.getBookName());
	}

}
