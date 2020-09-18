Feature: Add Feature for Calculator application

Scenario: add method with correct inputs
Given Calculator class object created
When add method called with valid input 
Then it should return correct output 

Scenario: add method with invalid inputs
Given Calculator class object created
When add method called with below inputs 
	  |133|133|
	  |128|56|
	  |4|23|
	  |54|121|
Then it should return zero

 

 