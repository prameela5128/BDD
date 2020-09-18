Feature: subtract feature

Scenario Outline: test subtract feature with diff set of inputs
Given Calculator class object created
When subtract method called with <num1> and <num2> inputs 
Then it returns <expected> value 
Examples:
|num1|num2|expected|
|45|20|25|
|37|1|36|
|25|15|10| 
