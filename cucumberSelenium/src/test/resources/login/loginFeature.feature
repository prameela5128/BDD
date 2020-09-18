Feature: login feature in hotel booking application

Scenario: login failed with invalid username password
Given user is on login page
When user enters invalid username password
Then alert box with Error message should be displayed

Scenario: login successful 
Given user is on login page
When user enters correct crediantials
Then hotelbooking page should be displayed

Scenario: login failed due to blank feilds 
Given user is on login page
When user keeps username and password blank
Then error message should be displayed

