

Feature: LoginPage- verification 

Scenario: LoginPage title verification 
Given User is on the homepage login
When  User gets the title of the Home page 
Then  Page title should be "Login - My Store"

@Skip_Scenario
Scenario: Forgot Password Link Verification 
Given User is on the homepage login 
Then  Forgot Your Password Link should be displayed 


Scenario: Login with Correct Login  Credentials  
Given User is on the homepage login 
When  User enters username "log2jiten24@gmail.com"
And   User enters password as "jeet47900"
And   User Clicks on the login button 
Then  User verifies the title of the Account Page
And   Page title should be "My account - My Store"
And   User clicks on the Signout button 




