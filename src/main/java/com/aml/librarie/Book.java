package com.aml.librarie;

public class Book {
	
	//properties
	private int ref;
	private String bookName;
	private String authorName;
	
	//constructors
	public Book (){
		this.ref = -1;
		this.bookName = "";
		this.authorName = "";
	}
	
	public Book (int ref, String bookName, String authorName) {
		this.ref = ref;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	//methods
	public void setRef (int ref) {
		this.ref = ref;
	}
	
	public int getRef () {
		return ref;
	}
	
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public String getBookName () {
		return this.bookName;
	}
	
	public void setBookName (String name) {
		this.bookName = name;
	}
	
	


}

	