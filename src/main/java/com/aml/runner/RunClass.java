package com.aml.runner;

import org.json.simple.JSONObject;

import com.aml.librarie.Book;
import com.aml.librarie.request.RequestJson;



public class RunClass {

	public static void main(String[] args) {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Book book;
		Librarie librarie = new Librarie ();
		
		System.out.print("Nombre libro: ");
		String bookName = br.readLine();
		book = new Book(011, bookName, "Johny Reland");
		librarie.addBook(book);
		*/
		
		Book book = new Book(112, "Kill'em all", "Johny Reland");
		RequestJson post;
		post = new RequestJson();
		JSONObject json;
		json = post.createBookJson(book);
		String jsonString = json.toJSONString();
		System.out.println(jsonString);
		

					
		//post.postJson(json);
	}

}

