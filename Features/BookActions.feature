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
Feature: Actions to the book item

@tag1
Scenario Outline: Create a new Book item
Given A book wit a reference number <ref>, an Author <authorName> and a title <bookName> 
When I create this book item with the reference number <ref>, the Author <authorName> and the title <bookName>
Then The book item is created with the correct fields <ref>, <authorName> and <bookName>

Examples:
|ref   |authorName|bookName|
|123   |"John Ireland"|"Kill'em all"|
	

@tag2
Scenario Outline: Get the ref number of a book item
Given a book item with a reference number <ref> 
When I want to obtain its reference number <ref> 
Then I get the reference number <ref> correctly

Examples:
  | ref  |
  | 456789 |
  
  
@tag3
Scenario: Create a book without reference, author name or book name
When I create a book without parameteres
Then book is created
And ref is -1, author name is "" and book name is ""



