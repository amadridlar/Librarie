package com.aml.librarie;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibrarieTest {
	
	private int ref = 001;
	private String authorName = "John Ireland";
	private String bookName = "Kill'em all!"; 
	Book book1 = new Book(ref, bookName, authorName);
	Book bookSameAuthor = new Book(002, "Mocktezuma", authorName);
	Book bookSameName = new Book(003, bookName, "Johny Reland");
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
		Assert.assertTrue(librarie.addBook(book1));
		
	}

	@Test
	public void testRemoveBook() {
		librarie.addBook(book1);
		Assert.assertTrue(librarie.removeBook(book1));
	}
	
	@Test
	public void testGetBookList () {
		ArrayList<Book> bookListObtained = new ArrayList <Book>();
		librarie.addBook(book1);
		librarie.addBook(book1);
		bookListObtained = librarie.getBookList();
		Assert.assertEquals(2, bookListObtained.size());
		Assert.assertEquals(authorName, bookListObtained.get(0).getAuthorName());
		Assert.assertEquals(authorName, bookListObtained.get(1).getAuthorName());
	}
	
	@Test
	public void testGetBooksByAuthor () {
		ArrayList<Book> booksWithSameAuthor = new ArrayList<Book>();
		librarie.addBook(book1);
		librarie.addBook(bookSameAuthor);
		booksWithSameAuthor = librarie.getBooksByAuthor(authorName);
		Assert.assertEquals(authorName, booksWithSameAuthor.get(0).getAuthorName());
		Assert.assertEquals(booksWithSameAuthor.get(0).getAuthorName(), booksWithSameAuthor.get(1).getAuthorName());
		
	}

}
