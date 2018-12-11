#Author: Bazith

Feature: testing the conference registration 

Scenario: test the title of the page
Given     user is on register page
Then      display the title

Scenario: test the firstname
Given     user is on register page
When      user click the next  link
Then      display alert firstname message

Scenario: test the lastname
Given     user is on register page 
When      user click the next  link after lastname filled
Then      display alert lastname message

Scenario: test the mailid
Given     user is on register page
When      user click the next link after mail filled
Then      display alert mailid message

Scenario: test the contact number
Given     user is on register page
When      user click the next link after contact filled
Then      display alert contact message

Scenario: test the contact correct number
Given     user is on register page
When      user click the next link after contact correct filled
Then      display alert contact correct message

Scenario: test the number of people
Given     user is on register page
When      user click the next link after number of people filled
Then      display alert number of people message

Scenario: test the buliding  and room number
Given     user is on register page
When      user click the next link after buliding  and room number filled
Then      display alert buliding  and room number message

Scenario: test the area name number
Given     user is on register page
When      user click the next link after area name  filled
Then      display alert area name message

Scenario: test the area name number
Given     user is on register page
When      user click the next link after area name  filled
Then      display alert area name message

Scenario: test the city name
Given     user is on register page
When      user click the next link after city name  filled
Then      display alert city name message

Scenario: test the state name
Given     user is on register page
When      user click the next link after state name  filled
Then      display alert state name message

Scenario: test the conference status
Given     user is on register page
When      user click the next link after conference status  filled
Then      display alert conference status message

Scenario: test the navigation page
Given     user is on register page
When      user click the next link after details  filled
Then      display alert navigation page message

Scenario: test the cardholder name
Given     user is on register page
When      user click the button 
Then      display alert cardholder name message

Scenario: test the card number
Given     user is on register page
When      user click the button after cardname
Then      display alert card number message

Scenario: test the card cvv
Given     user is on register page
When      user click the button after cardnumber
Then      display alert card cvv message

Scenario: test the card month
Given     user is on register page
When      user click the button after cardcvv
Then      display alert card month message

Scenario: test the card year
Given     user is on register page
When      user click the button after card month
Then      display alert card year message

Scenario: test the confirmation page
Given     user is on register page
When      user click the button after all details
Then      display alert  message