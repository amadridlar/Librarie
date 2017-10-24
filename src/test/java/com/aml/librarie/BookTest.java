package com.aml.librarie;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	private Book book;
	private int ref ;
	private String authorName;
	private String bookName;

	@Before
	public void setUp() throws Exception {
		 ref = 0123;
		 authorName = "John Ireland";
		 bookName = "Kill'em all!";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBookInit() {
		book = new Book(ref, bookName, authorName);
		Assert.assertEquals(ref	, book.getRef());
		Assert.assertEquals(authorName, book.getAuthorName());
		Assert.assertEquals(bookName, book.getBookName());

	}

	@Test
	public void testSetRef() {
		book = new Book();
		book.setRef(ref);
		Assert.assertEquals(ref, book.getRef());
		

	}

	@Test
	public void testGetRef() {
		book = new Book(ref, bookName, authorName);
		Assert.assertEquals(ref, book.getRef());
	}

	@Test
	public void testGetAuthorName() {
		book = new Book(ref, bookName, authorName);
		Assert.assertEquals(authorName, book.getAuthorName());
		}

	@Test
	public void testSetAuthorName() {
		book = new Book ();
		book.setAuthorName(authorName);
		Assert.assertEquals(authorName, book.getAuthorName());
	}

	@Test
	public void testGetBookName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBookName() {
		fail("Not yet implemented");
	}

}
