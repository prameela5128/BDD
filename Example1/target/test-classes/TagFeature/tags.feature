Feature: Login Application
Background: launch application
Given application is launched
@t1
Scenario: successful login
Given user is on login page
@t1 @t2
Scenario: unsuccessful login
Given user is on login page
@t2
Scenario: user credentials are empty
Given user is on login page
@t3
Scenario: add product to cart
Given user is on product page
@t1 @t3
Scenario: remove product from cart
Given user is on product page
@t2
Scenario: update quantity of product in cart
Given user is on cart tag
@t3
Scenario Outline: payment mode
Given user is on payment page
When user selects payment mode <paymentMode>
Examples:
| paymentMode|
|CC|
|DC|
|cash|
|gpay|
|paytm|