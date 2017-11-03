#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Request to the server to storage and get books and the library

@tag1
Scenario: Create a JSON	 with the data of a book
Given a book created without parameters
When I want to create a JSON of that book
Then the JSON is created correctly with ref = -1, authorName = NULL and bookName = NULL

@tag2
Scenario: Post request a JSON with the information of a book
Given a book created with ref = 112, authorName = "Johny Reland" and bookName = "Kill'em all"
When I make a post to the URL "C:\\xampp\\htdocs\\myjson\\bookJSON.json"
Then the json with the book information is storage with ref = 112, authorName = "Johny Reland" and bookName = "Kill'em all"

