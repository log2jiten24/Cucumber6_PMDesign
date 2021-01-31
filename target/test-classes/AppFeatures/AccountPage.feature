

Feature: Account Page Feature Verification 

Background:
Given User has already logged into the Application 
|username|password|
|log2jiten24@gmail.com|jeet47900|


Scenario: Account Page Title Verification 
Given User is on the Accounts  Page 
When  User verifies the title of the Account Page 
Then  Page title should be "My account - My Store"

Scenario: Account  Section Count verification 
Given User is on the Accounts  Page
Then  User gets lands on the Account Section page 
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And Accounts section count should be displayed as 6 
