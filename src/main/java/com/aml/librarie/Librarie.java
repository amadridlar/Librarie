package com.aml.librarie;

import java.util.ArrayList;

public class Librarie {
	
	//PROPERTIES
	private String NIF;
	private String name;
	private ArrayList <Book> bookList;

	  
	
	//CONSTRUCTORS
	public Librarie() {
		this.NIF = null;
		this.name = null;
		
	}
	
	
	//METHODS
	public boolean addBook (Book bookName) {
		boolean result;
		 try {
			 bookList.add (bookName);
			  result = true;
		 }
		 catch (Exception e) {
			  result = false;
		 }
		 
		 return result;
	}
	
	public boolean removeBook (Book bookName) {
		boolean result;
		
		try {
			bookList.remove(bookList.size() - 1);
			result = true;
		}
		catch (Exception e){
			result = false;
		}
		
		return result;
	}

}
