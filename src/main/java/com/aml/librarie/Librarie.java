package com.aml.librarie;

import java.util.ArrayList;

public class Librarie {
	
	//PROPERTIES
	private String NIF;
	private String name;
	private ArrayList<Book> bookList = new ArrayList<Book>();

	  
	
	//CONSTRUCTORS
	public Librarie() {
		this.NIF = null;
		this.name = null;
		
	}
	
	
	//METHODS
	
	/***
	 * Introduce un objeto de clase Book al ArrayList
	 * @param bookName objeto Book a introducir
	 * @return true si se ha añadido correctamente
	 */
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
	
	/**
	 * Elimina un objeto Book del ArrayList
	 * @param bookName objeto Book a eliminar
	 * @return true si se ha borrado correctamente
	 */
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
	
	/**
	 * Devuelve un objeto Book con la referencia indicada
	 * @param ref referencia del Book a buscar
	 * @return objeto Book con la referencia indicada
	 */
	public Book searchBookByRef (int ref) {
		Book book = null;
		
		for(int i=0;i<bookList.size();i++) {
			if (bookList.get(i).getRef() == ref) {
				book = bookList.get(i);
				break;
			}
		}
		return book;
	}
	
	/**
	 * Devuelve un arrayList con los libros que tienen el mismo autor
	 * @param authorName Nombre del autor de los libros a obtener
	 * @return ArrayList con todos los libros con el mismo autor
	 */
	public ArrayList<Book> getBooksByAuthor (String authorName){
		ArrayList<Book> sameAuthorBooks = new ArrayList<Book>();
		
		for(int i=0; i < bookList.size();i++) {
			if(bookList.get(i).getAuthorName() == authorName) {
				sameAuthorBooks.add(bookList.get(i));
			}
		}
		
		return sameAuthorBooks;
	}
	
	/**
	 * Devuelve el listado completo de libros
	 * @return ArrayList <Book>
	 */
	public ArrayList<Book> getBookList (){
		
		return bookList;
	}
}
