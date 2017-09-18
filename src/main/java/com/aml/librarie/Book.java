package com.aml.librarie;

public class Book {
	
	private int ref;
	private String bookName;
	private String authorName;
	
	public Book (){
		this.ref = -1;
		this.bookName = null;
		this.authorName = null;
	}
	
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

	