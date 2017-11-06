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
Scenario: Create a JSON	 with the data of a book with empty parameters
Given a book created without parameters
When I want to create a JSON of that book
Then the JSON is created correctly with ref = -1, authorName = "" and bookName = ""

@tag2
Scenario Outline: Create a JSON of a book with completed parameteres
Given a book created with <ref>, <bookName> and <authorName>
When I create a JSON of that book
Then The JSON created has <ref>, <bookName> and <authorName>

Examples:
|ref  |authorName     |bookName   |
|123  |"Johny Reland" |"Shoot'em all!" |

@tag3
Scenario Outline: Post request a JSON with the information of a book and receive a 200 status
Given a book created 
When I make a post to the URL <url>
Then the status code of the response is <status code>

Examples:
|url                                 |status code |
|"https://jsonblob.com/api/jsonBlob" |201         |

@tag4
Scenario Outline: Post a JSON of a book created and the JSON is posted correctly
Given a JSON of a book created with ref <ref>, bookName <bookName> and authorName <authorName>  
When I make a post request of that JSON to the url <url> 
Then I make a get request to the url <url> and the JSON has the ref <ref>, bookName <bookName> and authorName <authorName> correctly
And status code is <status>

Examples:
|ref    |authorName    |bookName      |url																 |status |
|112    |"Johny Reland"|"Shoot'em all"|"https://jsonblob.com/api/jsonBlob" |200    |

