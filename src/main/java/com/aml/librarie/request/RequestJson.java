package com.aml.librarie.request;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.aml.librarie.Book;
import com.google.gson.JsonElement;

public class RequestJson {
	
	//PROPERTIES
	public static final String URL = "C:\\xampp\\htdocs\\myjson\\bookJSON.json";
	
	//CONSTRUCTORS
	
	//METHODS
	public JSONObject createBookJson (Book book) {
		JSONObject json = new JSONObject();
		json.put("ref", book.getRef());
		json.put("authorName", book.getAuthorName());
		json.put("bookName", book.getBookName());
				
		return json;
	}
	
	public void postJson (JSONObject json) throws IOException {
		try {
			FileWriter file = new FileWriter (URL);
			file.write(json.toJSONString());
			file.flush();
			file.close();
			System.out.println(json.toJSONString());
	} catch (IOException e) {
		System.out.println("it does not work :(");
		
	}
	}
	
	

}
