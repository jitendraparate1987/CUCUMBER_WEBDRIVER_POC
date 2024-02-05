Feature: Login Validation on Markerspro App

Scenario: Login to Markerspro App with Valid Login Credentials
Given Navigate to Markerspro App
When enter the username "INMATRIXPROD"
When enter the password "Bj9Q28oeNbcu9Lg"
When submit the credentials
Then Validate dashboard is displayed


Scenario: Login to Markerspro App with Invalid Login Credentials
Given Navigate to Markerspro App
When enter the username "xyz"
When enter the password "xyz"
When submit the credentials
Then Error message should be displayed

