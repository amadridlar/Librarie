package com.aml.librarie;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibrarieTest {
	
	private int ref = 001;
	private String authorName = "John Ireland";
	private String bookName = "Kill'em all!"; 
	Book book = new Book(ref, bookName, authorName);
	Librarie librarie;
	

	@Before
	public void setUp() throws Exception {
		librarie = new Librarie(); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddBook() {
		Assert.assertTrue(librarie.addBook(book));
		
	}

	@Test
	public void testRemoveBook() {
		librarie.addBook(book);
		Assert.assertTrue(librarie.removeBook(book));
	}

}
