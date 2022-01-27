Feature: To test the ContactUs Feature testing.

@ContactUs
Scenario Outline: To test the ContactUs Feature link with different sets of test Data 

Given User navigates to the ContactUS Page from the link
When  User fills the data from the given SheetName "<Sheetname>" and rownumber <RowNumber>
And   User Clicks on the send Button 
Then  Success Message is being displayed "Your message has been successfully sent to our team."

Examples:
|Sheetname|RowNumber|
|ContactUs|  0 | 
|ContactUs|  1 |
|ContactUs|  2 |
|ContactUs|  3 |

