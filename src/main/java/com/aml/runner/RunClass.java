package com.aml.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.aml.librarie.Book;
import com.aml.librarie.Librarie;


public class RunClass {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Book book;
		Librarie librarie = new Librarie ();
		
		System.out.print("Nombre libro: ");
		String bookName = br.readLine();
		book = new Book(011, bookName, "Johny Reland");
		librarie.addBook(book);

	}

}

